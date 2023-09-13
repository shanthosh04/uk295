package ch.csbe.backendlb.Product;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import java.util.List;

@RestController
@RequestMapping("/products")
@Tag(name = "ProductController", description = "Hier finden sich alle Endpoints für Produkte")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    @Operation(
            summary = "Produkt nach ID abrufen",
            description = "Dieser Endpunkt ermöglicht das Abrufen eines Produkts anhand seiner ID.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Erfolgreiche Abfrage des Produkts"
                    ),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Produkt nicht gefunden - Die ID ist nicht vorhanden."
                    )
            }
    )
    public Product getProductById(@PathVariable Long id) throws NotFoundException {
        Product product = productService.getById(id);
        return product;
    }

    @GetMapping
    @Operation(
            summary = "Alle Produkte auflisten",
            description = "Dieser Endpunkt listet alle vorhandenen Produkte auf."
    )
    public List<Product> getProducts() {
        return productService.get();
    }

    @PostMapping
    @Operation(
            summary = "Produkt erstellen",
            description = "Dieser Endpunkt ermöglicht das Erstellen eines neuen Produkts."
    )
    public Product createProduct(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Das Produkt, das erstellt werden soll."
            ) @RequestBody Product product) {
        return productService.create(product);
    }

    @PutMapping("/{id}")
    @Operation(
            summary = "Produkt aktualisieren",
            description = "Dieser Endpunkt ermöglicht die Aktualisierung eines vorhandenen Produkts."
    )
    public Product updateProduct(
            @PathVariable Long id,
            @RequestBody Product product) {
        return productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    @Operation(
            summary = "Produkt löschen",
            description = "Dieser Endpunkt ermöglicht das Löschen eines Produkts anhand seiner ID."
    )
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteById(id);
    }
}
