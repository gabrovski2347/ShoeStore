package Models;

public class Employee
{
    private String ID;
    private String name;
    private double salary;
    private int age;
    private String graduation;
    private String gender;

    public Employee(String ID,
                    String name,
                    double salary,
                    int age,
                    String graduation,
                    String gender,
                    String position) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.graduation = graduation;
        this.gender = gender;
        this.position = position;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private String position;
}
