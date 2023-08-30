package ch.csbe.backendlb.Product;


import ch.csbe.backendlb.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping ("/products")
@RestController()
    public class ProductService {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String getProducts() {
        return "Hier wären meine Produkte";
    }

    @PostMapping("/")
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable("id") Long id) {
        return productService.getById(id);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable("id") Long id, @RequestBody Product product) {
        return productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        productService.deleteById(id);
    }
}



