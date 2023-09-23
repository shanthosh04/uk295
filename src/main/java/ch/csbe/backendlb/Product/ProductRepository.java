package ch.csbe.backendlb.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(exported = false)
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Custom query to find all products with a specific 'active' status
    @Query
    List<Product> findAllByActive(int active);

    // Custom query to find a single product with a specific 'active' status
    @Query("SELECT p FROM Product p WHERE p.active = ?1")
    Product findProductByActive(int active);
}
