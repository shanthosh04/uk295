package ch.csbe.backendlb.Category;

import ch.csbe.backendlb.Product.ProductController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productcategory")
public class CategoryController {

    @PostMapping("/{id}")
    public String addProductCategory(@RequestBody ProductController productControllerCategory) {

        return "Produktkategorie erfolgreich hinzugefügt";
    }

    @PutMapping("/{id}")
    public String editProductCategory(@RequestBody ProductController productControllerCategory) {

        return "Produktkategorie erfolgreich bearbeitet";
    }

    @DeleteMapping("/{id}")
    public String deleteProductCategory(@PathVariable ProductController productControllerCategory) {

        return "Produktkategorie erfolgreich gelöscht";
    }

    @GetMapping("/{id}")
    public String getProductCategory(@PathVariable ProductController productControllerCategory) {

        return "Alle ProduktKategorie erfolgreich eingesehen";
    }
}
