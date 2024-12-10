package org.example.model;

public class Chocolate extends ProductForSale{
    private String brand;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + this.getType() + ", Description: " + this.getDescription() + ", Price: " + this.getPrice() + ", Brand: " + this.brand);
    }

}
