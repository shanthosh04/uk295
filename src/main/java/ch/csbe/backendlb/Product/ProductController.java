package ch.csbe.backendlb.Product;

import ch.csbe.backendlb.Product.DTO.ProductCreateDto;
import ch.csbe.backendlb.Product.DTO.ProductDetailDto;
import ch.csbe.backendlb.Product.DTO.ProductMapper;
import ch.csbe.backendlb.Product.DTO.ProductUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper productMapper;

    // Retrieve all products
    @GetMapping("")
    public List<ProductDetailDto> getAllProducts() {
        return productService.get();
    }

    // Retrieve a product by ID
    @GetMapping("/{id}")
    public ProductDetailDto getProductById(@PathVariable Long id) {
        return productService.getById(id);
    }

    // Update a product by ID
    @PutMapping("/{id}")
    public ProductDetailDto updateProduct(@RequestBody ProductUpdateDto product, @PathVariable Long id) {
        return productService.update(id, product);
    }

    // Delete a product by ID
    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteById(id);
    }

    // Create a new product
    @PostMapping("")
    public ProductDetailDto createProduct(@RequestBody ProductCreateDto product) {
        return productService.create(product);
    }
}

