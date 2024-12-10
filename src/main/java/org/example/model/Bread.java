package org.example.model;

public class Bread extends ProductForSale{
    private double calories;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, double calories) {
        super(type, price, description);
        this.calories = calories;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + this.getType() + ", Description: " + this.getDescription() + ", Price: " + this.getPrice() + ", Calories: " + this.calories);
    }
}
