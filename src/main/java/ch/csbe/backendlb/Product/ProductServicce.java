package ch.csbe.backendlb.Product;

import ch.csbe.backendlb.Controllers.Product;
import org.springframework.stereotype.Service;

import java.util.Optional;

/*@Service
public class ProductServicce {

    private final (
    ProductRepository productRepository);
    this.productRepository =productRepository;

    public ProductRepository getProductRepository() {
        return productRepository.findAll();
    }

    public List<Product> get() {
        return productRepository.findAll();
    }

    public Product getByld(Long id) {
        Optional<Product> productOptional = productRepository.findAll(id);
        if (productOptional.isPresent()) {
            return productOptional.get();
        }
        return new Product();
    }
}
*/