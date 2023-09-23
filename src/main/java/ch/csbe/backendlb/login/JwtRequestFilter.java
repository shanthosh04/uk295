package ch.csbe.backendlb.login;

import ch.csbe.backendlb.User.User;
import ch.csbe.backendlb.User.UserService;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    @Autowired
    private UserService userService;

    private final String SECRET_KEY = "yourSecretKey";

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain chain
    ) throws ServletException, IOException {
        // Step 2: Extract JWT token from the Authorization header
        final String authorizationHeader = request.getHeader("Authorization");

        String email = null;
        String jwt = null;

        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            jwt = authorizationHeader.substring(7);
            email = Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(jwt).getBody().getSubject();
        }

        // Step 3: Check if the email is valid and there's no existing authentication
        if (email != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            User user = userService.findUserByEmail(email);
            MyUserPrincipal userPrincipal = new MyUserPrincipal(user);
            userPrincipal.setEmail(user.getEmail());
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userPrincipal, null, userPrincipal.getAuthorities());
            // Step 4: Set the authentication in the SecurityContextHolder
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        }

        chain.doFilter(request, response);
    }
}
