package com.company;

public class Shoe extends Product
{
    private String model;
    private String brand;
    private int size;
    private String color;
    private int qantity;

    public Shoe(double price, String model, String brand, int size, String color, String ID, int qantity) {
        //- обръщение към конструктора на родителския клас
        //родителския клас няма полетата на наследника
        super(price, ID);
        this.model = model;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.qantity = qantity;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQantity() {
        return qantity;
    }

    public void setQantity(int qantity) {
        this.qantity = qantity;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", qantity=" + qantity +
                '}';
    }
}

