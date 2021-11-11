package Models;

import java.util.ArrayList;

public class Store
{
    private String name;
    private ArrayList<Shoe> shoes = new ArrayList<>();
    // employees
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    // Owner
    private String owner;
    // address
    private String address;

    public Store(String name, ArrayList<Shoe> shoes,
                 ArrayList<Employee> employees,
                 String owner,
                 String address)
    {
        this.name = name;
        this.shoes = shoes;
        this.employees = employees;
        this.owner = owner;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Shoe> getShoes() {
        return shoes;
    }

    public void setShoes(ArrayList<Shoe> shoes) {
        this.shoes = shoes;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void HireEmployee(Employee employee)
    {
        if (employee.getAge() >= 18)
            employees.add(employee);
        else
            System.out.println("Not old enough");
    }

    public void addShoe(Shoe shoe)
    {
        shoes.add(shoe);
    }

    public void FireEmployee(String ID)
    {
        var firedEmployee =  employees.stream()
                .filter(e -> e.getID().equals(ID))
                .findFirst()
                .map(e -> (Employee)e);

        if (firedEmployee != null)
        {
            employees.remove(firedEmployee);
        }
        else
        {
            System.out.println("No such employee hired!");
        }
    }
    // Select Shoes (by price, by brand, etc...)

}
