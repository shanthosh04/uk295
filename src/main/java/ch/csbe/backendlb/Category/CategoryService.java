package ch.csbe.backendlb.Category;

import ch.csbe.backendlb.Category.DTO.CategoryCreateDto;
import ch.csbe.backendlb.Category.DTO.CategoryDetailDto;
import ch.csbe.backendlb.Category.DTO.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    CategoryMapper categoryMapper;


    public List<CategoryDetailDto> get() {

        return categoryRepository.findAll().stream().map(categoryMapper::toDetailDto).collect(Collectors.toList());
    }

    public CategoryDetailDto getById(Long id) {
        Category category = this.categoryRepository.getById(id);

        CategoryDetailDto categoryDetailDto = categoryMapper.toDetailDto(category);
        return categoryDetailDto;
    }

    public CategoryDetailDto create(CategoryCreateDto category) {
        return categoryMapper.toDetailDto(categoryRepository.save(categoryMapper.toEntity(category))) ;
    }

    public CategoryDetailDto update(Long id) {
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        if (categoryOptional.isPresent()) {
            Category existingCategory = categoryOptional.get();
            existingCategory.setName(category.getName());
            existingCategory.setActive(Integer.parseInt(category.getActive()));
            return categoryMapper.toDetailDto(categoryRepository.save(existingCategory));
        }
        return new CategoryDetailDto();
    }

    public void deleteById(Long id) {
        categoryRepository.deleteById(id);


    }
}


