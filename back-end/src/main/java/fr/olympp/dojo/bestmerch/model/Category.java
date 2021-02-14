package fr.olympp.dojo.bestmerch.model;

import io.jsondb.annotation.Document;
import io.jsondb.annotation.Id;

@Document(collection = "categories", schemaVersion = "1.0")
public class Category {
    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
