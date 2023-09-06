package ch.csbe.backendlb.Category;

import ch.csbe.backendlb.Product.ProductController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productcategory")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("")
    public Category createCategory(@RequestBody Category category) {

        return categoryService.create(category);
    }

    @PutMapping("/{id}")
    public Category editProductCategory(@PathVariable Long id, @RequestBody Category category) {

        return categoryService.update(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteProductCategory(@PathVariable Long id) {

        categoryService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Category getById(@PathVariable Long id) {
        return categoryService.getById(id);
    }

    @GetMapping("/")
    public List<Category> getCategorys() {

        return categoryService.get();
    }
}
