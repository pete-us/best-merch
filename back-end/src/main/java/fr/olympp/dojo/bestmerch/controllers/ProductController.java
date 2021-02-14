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
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    private final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/{productId}")
    @ResponseBody
    public ResponseEntity<List<Category>> getProductInformation(@PathVariable String productId) {
        return null;
    }
}
