package fr.olympp.dojo.bestmerch;

import fr.olympp.dojo.bestmerch.controllers.CategoryController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(new Class[]{Application.class, CategoryController.class}, args);
    }
}
