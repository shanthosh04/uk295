package ch.csbe.backendlb.Product;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Tag(name = "ProductController", description = "Hier finden sich alle Endpoints für Produkte")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/")
    @Operation(
            summary = "Produkt erstellen",
            operationId = "addProduct",
            description = "Dieser Endpunkt ermöglicht das Erstellen eines neuen Produkts."
    )
    public String addProduct(@RequestBody ProductController productController) {
        return "Produkt erfolgreich hinzugefügt";
    }

    @GetMapping
    @Operation(
            summary = "Alle Produkte auflisten",
            operationId = "getProducts",
            description = "Dieser Endpunkt listet alle vorhandenen Produkte auf."
    )
    public List<Product> getProducts() {
        return productService.get();
    }

    @PostMapping
    @Operation(
            summary = "Produkt erstellen",
            operationId = "createProduct",
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
            operationId = "updateProduct",
            description = "Dieser Endpunkt ermöglicht die Aktualisierung eines vorhandenen Produkts."
    )
    public Product updateProduct(
            @Parameter(description = "Die ID des zu aktualisierenden Produkts.") @PathVariable Long id,
            @RequestBody Product product) {
        return productService.update(id, product);
    }

    @GetMapping("/{id}")
    @Operation(
            summary = "Produkt nach ID abrufen",
            operationId = "getProductById",
            description = "Dieser Endpunkt ermöglicht das Abrufen eines Produkts anhand seiner ID."
    )
    public Product getProductbyId(@PathVariable Long id) {
        return productService.getById(id);
    }

    @DeleteMapping("/{id}")
    @Operation(
            summary = "Produkt löschen",
            operationId = "deleteProduct",
            description = "Dieser Endpunkt ermöglicht das Löschen eines Produkts anhand seiner ID."
    )
    public void deleteProduct(
            @Parameter(description = "Die ID des zu löschenden Produkts.") @PathVariable Long id) {
        productService.deleteById(id);
    }
}