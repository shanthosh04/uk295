package ch.csbe.backendlb.Product;


import ch.csbe.backendlb.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllToDoByActive(int active);

    @Query("SELECT c FROM Category c WHERE c.active = ?1")
    Product findProductByType(int active);

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.ProductRepository = productRepository;
    }

    public List<Product> get () {
        return ProductRepository.findAll();
    }

    public Product getById (Long id){
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            return productOptional.get();
        }
        return new Product();
    }

    public Product create (Product product){
        return productRepository.save(product);
    }

    public Product update (Long id, Product product){
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            Product existingProduct = productOptional.get();
            existingProduct.setName(Product.getName());
            existingProduct.setPrice(Product.getPrice());
            existingProduct.setCategory(Product.getCategory());
            return ProductRepository.save(existingProduct);
        }
        return new Product();
    }

    public void deleteById(Long id){
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
        }
    }
}
}
