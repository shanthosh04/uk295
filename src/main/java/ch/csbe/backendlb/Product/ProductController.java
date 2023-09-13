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
            operationId = "AddProduct",
            summary = "Produkt erstellen",
            description = "Dieser Endpunkt ermöglicht das Erstellen eines neuen Produkts."
    )
    public String addProduct(@RequestBody ProductController productController) {
        return "Produkt erfolgreich hinzugefügt";
    }

    @GetMapping
    @Operation(
            operationId = "GetProducts",
            summary = "Alle Produkte auflisten",
            description = "Dieser Endpunkt listet alle vorhandenen Produkte auf."
    )
    public List<Product> getProducts() {
        return productService.get();
    }

    @PostMapping
    @Operation(
            operationId = "CreateProduct",
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
            operationId = "updateProduct",
            summary = "Produkt aktualisieren",
            description = "Dieser Endpunkt ermöglicht die Aktualisierung eines vorhandenen Produkts."
    )
    public Product updateProduct(
            @Parameter(description = "Die ID des zu aktualisierenden Produkts.") @PathVariable Long id,
            @RequestBody Product product) {
        return productService.update(id, product);
    }

    @GetMapping("/{id}")
    @Operation(
            operationId = "GetProductById",
            summary = "Produkt nach ID abrufen",
            description = "Dieser Endpunkt ermöglicht das Abrufen eines Produkts anhand seiner ID."
    )
    public Product getProductbyId(@PathVariable Long id) {
        return productService.getById(id);
    }

    @DeleteMapping("/{id}")
    @Operation(
            operationId = "DeleteProduct",
            summary = "Produkt löschen",
            description = "Dieser Endpunkt ermöglicht das Löschen eines Produkts anhand seiner ID."
    )
    public void deleteProduct(
            @Parameter(description = "Die ID des zu löschenden Produkts.") @PathVariable Long id) {
        productService.deleteById(id);
    }
}