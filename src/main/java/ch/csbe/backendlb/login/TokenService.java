package ch.csbe.backendlb.login;

import ch.csbe.backendlb.User.UserService;
import ch.csbe.backendlb.resources.user.UserEntitie;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {
    // PLEASE USE A MORE SECURE KEY :-)
    private final String SECRET_KEY = "yourMoreSecretKey";
    public String generateToken(UserService user) {
        return Jwts.builder()
                .setSubject(user.getmail())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}


