package org.example.model;

public abstract class ProductForSale {
    private double price;
    private String description;
    private String type;

    public ProductForSale(String type, double price ,String description) {
        this.price = price;
        this.description = description;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public double getSalesPrice(int quantity){
        return quantity*this.price;
    }

    public abstract void showDetails();
}
