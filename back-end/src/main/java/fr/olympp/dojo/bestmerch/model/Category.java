package fr.olympp.dojo.bestmerch.model;

public class Category {

    public static class Builder {
        private String name;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Category build() {
            Category category = new Category();
            category.setName(this.name);
            return category;
        }
    }

    private String name;

    private Category() {
        // Use the builder to create an instance
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
