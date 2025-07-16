package org.example.model;

public class Chocolate extends ProductForSale {
    private int milkChocolate;
    public  Chocolate(String type, double price, String description, int milkChocolate){
        super(type,price,description);
        this.milkChocolate = milkChocolate;
    }

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate");
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Percentage: " + milkChocolate + "%");
    }
}
