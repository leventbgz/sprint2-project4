package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        ProductForSale chocolate = new Chocolate("White", 3,"WithNuts" ,"Nutshell");
        ProductForSale coke = new Coke("American", 5, "TheBestCoke" , true);
        ProductForSale bread = new Bread("Kepek", 1, "HealtierBread" , 300);
        products[0] = chocolate;
        products[1] = coke;
        products[2] = bread;

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            product.showDetails();
        }
    }
}