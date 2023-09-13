package ch.csbe.backendlb.Product;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Tag( name  = "ProductController" , description = "Hier bfinden sich alle Endpoints")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/")
    @Operation (summary = " Erstellt ein Produkt", operationId = "Add Product" , description = "Erstellt Produkte")
    public String addProduct(@RequestBody ProductController productController) {

        return "Produkt erfolgreich hinzugefügt";
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.get();
    }

    @PostMapping
    public Product createProduct(@io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Das Produkt was erstellt werden soll.") @RequestBody Product product) {
        return productService.create(product);
    }

    @PutMapping("/{id}")

    public Product updateProduct(@Parameter  @PathVariable Long id, @RequestBody Product product) {
        return productService.update(id, product);
    }

    @GetMapping("/{id}")
    public Product getProductbyId(@PathVariable Long id) {
        return productService.getById(id);
    }

    @DeleteMapping("/id")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteById(id);
    }
}
