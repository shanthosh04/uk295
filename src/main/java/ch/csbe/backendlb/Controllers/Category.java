package ch.csbe.backendlb.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productcategory")
public class Category {

    @PostMapping("/{id}")
    public String addProductCategory(@RequestBody Product productCategory) {

        return "Produktkategorie erfolgreich hinzugefügt";
    }

    @PutMapping("/{id}")
    public String editProductCategory(@RequestBody Product productCategory) {

        return "Produktkategorie erfolgreich bearbeitet";
    }

    @DeleteMapping("/{id}")
    public String deleteProductCategory(@PathVariable Product productCategory) {

        return "Produktkategorie erfolgreich gelöscht";
    }

    @GetMapping("/{id}")
    public String getProductCategory(@PathVariable Product productCategory) {

        return "Alle ProduktKategorie erfolgreich eingesehen";
    }

    @GetMapping("/{id}")
    public String listProductsByCategory(@PathVariable Product productCategory) {

        return "Alle Produktkategorie erfolgreich aufgelistet";
    }
}
