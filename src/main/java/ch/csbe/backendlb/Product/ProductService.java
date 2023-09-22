package ch.csbe.backendlb.Product;

import ch.csbe.backendlb.Product.DTO.ProductDetailDto;
import ch.csbe.backendlb.Product.DTO.ProductMapper;
import ch.csbe.backendlb.Product.DTO.ProductUpdateDto;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> get() {
        return productRepository.findAll();
    }

    public Product getById(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            return productOptional.get();
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produkt mit der id " + id + " wurde nicht gefunden.");
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }


    public Product update(Long id, Product updatedProduct) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            Product existingProduct = productOptional.get();
            existingProduct.setProductName(updatedProduct.getProductName());
            existingProduct.setPrice(updatedProduct.getPrice());
            return productRepository.save(existingProduct);
        }
        return new Product();
    }

    public ProductDetailDto update(Long id, ProductUpdateDto product) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            Product existingProduct = productOptional.get();
            existingProduct.setProductName(product.getName());
            existingProduct.setActive(product.getActive());
            existingProduct.setSku(product.getSku());
            existingProduct.setImage(product.getImages());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrise());
            existingProduct.setStock(product.getStock());
            return ProductMapper.DetailDto(productRepository.save(existingProduct));
        }
        return new ProductDetailDto();
    }

    public void deleteById(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
        }
    }
}
