package fr.olympp.dojo.bestmerch.model;

import io.jsondb.annotation.Document;
import io.jsondb.annotation.Id;

@Document(collection = "products", schemaVersion = "1.0")
public class Product {
    @Id
    private Integer id;
    private String name;
    private double price;
    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
