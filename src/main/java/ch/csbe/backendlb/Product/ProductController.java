package ch.csbe.backendlb.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/")
    public String addProduct(@RequestBody ProductController productController) {

        return "Produkt erfolgreich hinzugefügt";
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.get();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.create(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.update(id, product);
    }

    @GetMapping("/{id}")
    public String listProduct(@PathVariable Long id) {
        return "Pordukt erfolgreich aufgelistet.";
    }

    @DeleteMapping("/id")
    public  String deleteProduct(@PathVariable Long id) {
        return "Produkt erfolgreich gelöscht.";
    }
}
