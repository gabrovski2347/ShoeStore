package Models;

public class Shoe extends Product
{
    private String model;
    private String brand;
    private int size;
    private String color;
    private int quantity;

    public Shoe(double price, String model, String brand, int size, String color, String ID, int quantity) {
        //- обръщение към конструктора на родителския клас
        //родителския клас няма полетата на наследника
        super(price, ID);
        this.model = model;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", qantity=" + quantity +
                '}';
    }
}

