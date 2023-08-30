package ch.csbe.backendlb.Product;

import ch.csbe.backendlb.Entities.Product;
import ch.csbe.backendlb.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllToDoByLastname(String lastname);

    @Query("SELECT u FROM User u WHERE u.lastname = ?1")
    Product findProductByType(String lastname);
}
