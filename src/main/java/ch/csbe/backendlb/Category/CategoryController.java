package ch.csbe.backendlb.Category;

import ch.csbe.backendlb.Category.DTO.CategoryDetailDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productcategory")
@Tag(name = "CategoryController", description = "Endpoints for product categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    // Create a new product category
    @PostMapping("/{id}")
    @Operation(
            operationId = "AddCategoryByID",
            summary = "Create Category",
            description = "This endpoint allows creating a new product category."
    )
    public CategoryDetailDto createCategory(@RequestBody Category category) {
        return categoryService.create(category);
    }

    // Edit an existing product category by ID
    @PutMapping("/{id}")
    @Operation(
            operationId = "EditCategoryByID",
            summary = "Edit Category",
            description = "This endpoint allows editing a product category."
    )
    public CategoryDetailDto editProductCategory(@PathVariable Long id, @RequestBody Category category) {
        return categoryService.update(id, category);
    }

    // Delete a product category by ID
    @DeleteMapping("/{id}")
    @Operation(
            operationId = "DeleteCategoryByID",
            summary = "Delete Category",
            description = "This endpoint allows deleting a product category by its ID."
    )
    public void deleteProductCategory(@PathVariable Long id) {
        categoryService.deleteById(id);
    }

    // Get a product category by ID
    @GetMapping("/{id}")
    @Operation(
            operationId = "GetCategoryByID",
            summary = "Get Category by ID",
            description = "This endpoint allows retrieving a product category by its ID."
    )
    public CategoryDetailDto getById(@PathVariable Long id) {
        return categoryService.getById(id);
    }

    // List all product categories
    @GetMapping("/")
    @Operation(
            operationId = "GetCategories",
            summary = "List All Categories",
            description = "This endpoint lists all existing product categories."
    )
    public List<CategoryDetailDto> getCategories() {
        return categoryService.get();
    }
}
