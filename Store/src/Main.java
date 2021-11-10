package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        var shoes = new ArrayList<Shoe>();
        Store store = new Store("ShoeStore",
                                    shoes,
                                    new ArrayList<Employee>(),
                                    "George", "");
        while(true)
        {
            System.out.println("Chose command: 1.ChangeStoreName, 2.GetShoe, 3.AddShoe, 4.Restock, 5.HireEmployee, 6.FireEmployee, 7.Exit");
            String command = scan.nextLine();

            //1.ChangeStoreName
            if (command.equals("ChangeStoreName") || command.equals("1"))
            {
                System.out.println("Input new name: ");
                String name = scan.nextLine();
                store.setName(name);
            }

            // 2.GetShoe
            else if (command.equals("GetShoe") || command.equals("2"))
            {
                System.out.println("Enter ID");
                var ID = scan.nextLine();
                var shoe =  shoes.stream()
                        .filter(x -> x.getID().equals(ID))
                        .map(x -> (Shoe)x)
                        .collect(Collectors.toList())
                        .stream().findFirst();
            }

            //3.AddShoe
            else if (command.equals("AddShoe") || command.equals("3"))
            {
                var shoe = ReadShoe(scan);
                store.addShoe(shoe);
            }

            // 4.Restock,
            else if (command.equals("Restock") || command.equals("4"))
            {
                System.out.println("Enter ID");
                var restockedNumber = Integer.parseInt(scan.nextLine());
                var ID = scan.nextLine();
                Shoe shoe = (Shoe) shoes.stream()
                        .filter(x -> x.getID().equals(ID))
                        .map(x -> (Shoe)x);

                shoe.setQantity(shoe.getQantity() + restockedNumber);
            }

            // 5.HireEmployee,
            else if (command.equals("HireEmployee") || command.equals("5"))
            {
                Employee employee = ReadEmployee(scan);
                store.HireEmployee(employee);
            }
            // 6.FireEmployee
            else if (command.equals("FireEmployee") || command.equals("6"))
            {
                System.out.println("Input ID: ");
                String ID = scan.nextLine();
                store.FireEmployee(ID);
            }

            // 7.Exit
            else if (command.equals("Exit"))
                break;
        }
    }

    private static Employee ReadEmployee(Scanner scan)
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

    private static Shoe ReadShoe(Scanner scan)
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
}
