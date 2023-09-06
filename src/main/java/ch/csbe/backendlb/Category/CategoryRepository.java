package ch.csbe.backendlb.Category;


import ch.csbe.backendlb.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAllToDoByName(String Name);

    @Query("SELECT c FROM Category c  WHERE c.name = ?1")
    Product findProductByType(String name);
}
