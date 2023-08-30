package ch.csbe.backendlb.Product;


import ch.csbe.backendlb.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllToDoByActive(int active);

    @Query("SELECT c FROM Category c WHERE c.active = ?1")
    Product findProductByType(int active);
}
