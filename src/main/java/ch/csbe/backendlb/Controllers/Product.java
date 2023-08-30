package ch.csbe.backendlb.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class Product {

    @PostMapping("/")
    public String addProduct(@RequestBody Product product) {

        return "Produkt erfolgreich hinzugefügt";
    }

    @PostMapping("/")
    public String seeProduct(@RequestBody Product product) {

        return "Produkt erfolgreich eingesehen";
    }

    @PostMapping("/{id}")
    public String editProduct(@RequestBody Product product) {

        return "Produkt erfolgreich bearbeitet";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {

        return "Produkt erfolgreich gelöscht";
    }

    @GetMapping("/{id}")
    public String listProduct(@PathVariable Long id) {

        return "Pordukt erfolgreich aufgelistet.";
    }
}
