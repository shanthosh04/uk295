package ch.csbe.backendlb.Category;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> get() {
        return categoryRepository.findAll();
    }

    public Category getById(Long id) {
        Optional<Category> productOptional = categoryRepository.findById(id);
        if (productOptional.isPresent()) {
            return productOptional.get();
        }
        return new Category();
    }

    public Category create(Category category) {
        return categoryRepository.save(category);
    }


    public Category update(Long id, Category updatedCategory) {
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        if (categoryOptional.isPresent()) {
            Category existingCategory = categoryOptional.get();
            existingCategory.setName(updatedCategory.getName());
            return categoryRepository.save(existingCategory);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produkt mit der id " + id + " wurde nicht gefunden.");
    }

    public void deleteById(Long id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
        }
    }
}
