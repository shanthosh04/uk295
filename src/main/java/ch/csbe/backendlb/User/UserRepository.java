package ch.csbe.backendlb.User;

import ch.csbe.backendlb.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllToDoByLastname(String lastname);


    @Query("SELECT u FROM User u WHERE u.lastName = ?1")
    Product findProductByType(String lastname);

    @Query("SELECT DISTINCT u FROM User u WHERE u.email = :email")
    User findUserByEmail(@Param("email") String email);

    public interface ProductRepository extends JpaRepository<Product, Long> {
        List<Product> findProductsById(Long id);

        @Query("SELECT p FROM Product  p WHERE p.id= ?1")
        Product findProductById(Long id);

        @Query("UPDATE Product p SET p.productName = ?2 WHERE p.id = ?1")
        @Modifying
        void updateProductNameById(Long id, String newName);


        @Query("DELETE FROM Product  p WHERE p.id= ?1")
        @Modifying
        Product deleteProductById(Long id);

    }
}
