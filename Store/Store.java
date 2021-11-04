package com.company;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Store
{
    private String name;
    private HashMap<Shoe, Integer> shoes = new HashMap<Shoe, Integer>();
    // employees
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    // Owner
    private String owner;
    // address
    private String address;

    public Store(String name, HashMap<Shoe, Integer> shoes,
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

    public HashMap<Shoe, Integer> getShoes() {
        return shoes;
    }

    public void setShoes(HashMap<Shoe, Integer> shoes) {
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
        shoes.put(shoe, 0);
    }
    // Select Shoes (by price, by brand, etc...)

}
