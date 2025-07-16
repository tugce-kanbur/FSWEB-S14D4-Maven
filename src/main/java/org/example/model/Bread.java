package org.example.model;

public class Bread extends ProductForSale {
    private final int slicedBread;

    public Bread(String type, double price, String description, int slicedBread) {
        super(type, price, description);
        this.slicedBread = slicedBread;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread");
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Sliced Bread: " + slicedBread);
    }
}
