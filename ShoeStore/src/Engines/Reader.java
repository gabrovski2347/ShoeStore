package Engines;

import Models.Employee;
import Models.Shoe;

import java.util.Scanner;

public class Reader
{
    private static Scanner scan = new Scanner(System.in);

    public static Employee ReadEmployee()
    {
        System.out.println("Input ID: ");
        String ID = scan.nextLine();

        System.out.println("Input name: ");
        String name = scan.nextLine();

        System.out.println("Input salary: ");
        double salary = Double.parseDouble(scan.nextLine());

        System.out.println("Input age: ");
        int age = Integer.parseInt(scan.nextLine());

        System.out.println("Input graduation: ");
        String graduation = scan.nextLine();

        System.out.println("Input gender: ");
        String gender = scan.nextLine();

        System.out.println("Input position: ");
        String position = scan.nextLine();

        System.out.println("Input employee: ");

        Employee employee = new Employee(ID, name, salary, age, graduation, gender, position);

        return employee;
    }

    public static Shoe ReadShoe()
    {
        System.out.println("Input price: ");
        double price = Double.parseDouble(scan.nextLine());

        System.out.println("Input model: ");
        String model = scan.nextLine();

        System.out.println("Input brand: ");
        String brand = scan.nextLine();

        System.out.println("Input size: ");
        int size = Integer.parseInt(scan.nextLine());

        System.out.println("Input color: ");
        String color = scan.nextLine();

        System.out.println("Input ID: ");
        String ID = scan.nextLine();
        //double price, String model, String brand, int size, String color, String ID, int qantity)

        System.out.println("Input qantity: ");
        int qantity = Integer.parseInt(scan.nextLine());
        return new Shoe(price, model, brand, size, color, ID, qantity);
    }

    public static String ReadLine()
    {
        return scan.nextLine();
    }
}
