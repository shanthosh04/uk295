package ch.csbe.backendlb.Product;

import ch.csbe.backendlb.Product.DTO.ProductCreateDto;
import ch.csbe.backendlb.Product.DTO.ProductDetailDto;
import ch.csbe.backendlb.Product.DTO.ProductMapper;
import ch.csbe.backendlb.Product.DTO.ProductUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired ProductService productService;

    @Autowired
    ProductMapper productMapper;

    @GetMapping("")
    public List<ProductDetailDto> get() {
        return productService.get();
    }

    @GetMapping("/{id}")
    public ProductDetailDto getById(@PathVariable Long id) {
        return productService.getById(id);
    }



    @PutMapping("/{id}")
    public ProductDetailDto update(@RequestBody ProductUpdateDto product, @PathVariable Long id) {
        return  productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }

    @PostMapping("")
    public ProductDetailDto create(@RequestBody ProductCreateDto product) {
        return productService.create(product);
    }





}
