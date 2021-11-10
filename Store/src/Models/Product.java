package com.company;

public class Product {
    private double price;
    private String ID;

    public Product(double price, String ID) {
        this.price = price;
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public String getID() {
        return ID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
