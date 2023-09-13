package ch.csbe.backendlb.Category;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productcategory")
@Tag(name = "CategoryController", description = "Hier finden sich alle Endpoints für Produktkategorien")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("")
    @Operation(
            summary = "Kategorie erstellen",
            description = "Dieser Endpunkt ermöglicht das Erstellen einer neuen Produktkategorie."
    )
    public Category createCategory(@RequestBody Category category) {
        return categoryService.create(category);
    }

    @PutMapping("/{id}")
    @Operation(
            summary = "Kategorie bearbeiten",
            description = "Dieser Endpunkt ermöglicht das Bearbeiten einer Produktkategorie."
    )
    public Category editProductCategory(@PathVariable Long id, @RequestBody Category category) {
        return categoryService.update(id, category);
    }

    @DeleteMapping("/{id}")
    @Operation(
            summary = "Kategorie löschen",
            description = "Dieser Endpunkt ermöglicht das Löschen einer Produktkategorie anhand ihrer ID."
    )
    public void deleteProductCategory(@PathVariable Long id) {
        categoryService.deleteById(id);
    }

    @GetMapping("/{id}")
    @Operation(
            summary = "Kategorie nach ID abrufen",
            description = "Dieser Endpunkt ermöglicht das Abrufen einer Produktkategorie anhand ihrer ID."
    )
    public Category getById(@PathVariable Long id) {
        return categoryService.getById(id);
    }

    @GetMapping("/")
    @Operation(
            summary = "Alle Kategorien auflisten",
            description = "Dieser Endpunkt listet alle vorhandenen Produktkategorien auf."
    )
    public List<Category> getCategorys() {
        return categoryService.get();
    }
}
