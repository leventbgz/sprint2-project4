package org.example.model;

public class Coke extends ProductForSale{
    private boolean isWithSugar;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, boolean isWithSugar) {
        super(type, price, description);
        this.isWithSugar = isWithSugar;
    }



    @Override
    public void showDetails() {
        System.out.println("Type: " + this.getType() + ", Description: " + this.getDescription() + ", Price: " + this.getPrice() + ", IsWithSugar: " + this.isWithSugar);
    }
}
