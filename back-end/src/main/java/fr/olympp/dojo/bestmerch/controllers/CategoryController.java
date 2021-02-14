package fr.olympp.dojo.bestmerch.controllers;

import fr.olympp.dojo.bestmerch.model.Category;
import fr.olympp.dojo.bestmerch.model.Product;
import io.jsondb.JsonDBTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {

    private final JsonDBTemplate jsonDBTemplate = new JsonDBTemplate("src/main/resources/data",
            "fr.olympp.dojo.bestmerch.model");

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Category>> listCategories() {
        List<Category> categories = jsonDBTemplate.getCollection(Category.class);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/{category}")
    @ResponseBody
    public ResponseEntity<List<Product>> listProductsForCategory(@PathVariable String category) {
        List<Product> products = jsonDBTemplate.getCollection(Product.class).stream()
                .filter(product -> category.equals(product.getCategory().getName()))
                .collect(Collectors.toList());
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
