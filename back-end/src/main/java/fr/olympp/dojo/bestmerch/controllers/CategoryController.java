package fr.olympp.dojo.bestmerch.controllers;

import fr.olympp.dojo.bestmerch.model.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {

    private final Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<List<Category>> listCategories() {
        try (InputStreamReader isr = new InputStreamReader(new ClassPathResource("data/categories.txt").getInputStream())) {
            try (BufferedReader br = new BufferedReader(isr)) {
                List<Category> categories = new ArrayList<>();
                String categoryName;
                while ((categoryName = br.readLine()) != null) {
                    categories.add(new Category.Builder().name(categoryName).build());
                }
                return new ResponseEntity<>(categories, HttpStatus.OK);
            }
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(), e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
