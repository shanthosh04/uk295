package ch.csbe.backendlb.Product;

import ch.csbe.backendlb.Product.DTO.ProductCreateDto;
import ch.csbe.backendlb.Product.DTO.ProductDetailDto;
import ch.csbe.backendlb.Product.DTO.ProductMapper;
import ch.csbe.backendlb.Product.DTO.ProductUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    ProductRepository productRepository;

    // Get product details by ID
    public ProductDetailDto getById(Long id) {
        Product product = this.productRepository.getById(id);
        return productMapper.DetailDto(product);
    }

    // Get a list of all products
    public List<ProductDetailDto> get() {
        // Retrieve all products, map them to DTOs, and collect them into a list
        return productRepository.findAll()
                .stream()
                .map(productMapper::DetailDto)
                .collect(Collectors.toList());
    }

    // Create a new product
    public ProductDetailDto create(ProductCreateDto product) {
        // Map the DTO to an entity and save it, then return the corresponding DTO
        return productMapper.DetailDto(productRepository.save(productMapper.toEntity(product)));
    }

    // Update an existing product by ID
    public ProductDetailDto update(Long id, ProductUpdateDto product) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            Product existingProduct = productOptional.get();
            // Update the fields of the existing product entity
            existingProduct.setProductName(product.getProductName());
            existingProduct.setActive(product.getActive());
            existingProduct.setSku(product.getSku());
            existingProduct.setImage(product.getImage());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setStock(product.getStock());
            // Save the updated entity and return the corresponding DTO
            return productMapper.DetailDto(productRepository.save(existingProduct));
        }
        // Return an empty DTO if the product ID does not exist
        return new ProductDetailDto();
    }

    // Delete a product by ID if it exists
    public void deleteById(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
        }
    }
}
