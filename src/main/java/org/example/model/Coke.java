package org.example.model;

public class Coke extends ProductForSale {
    private final boolean zero;

    public Coke(String type, double price, String description) {
        super(type,price,description);
        this.zero = false;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke");
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Zero: " + (zero ? "Yes" : "No"));
    }
}
