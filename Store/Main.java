package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Store store = new Store("ShoeStore",
                                    new HashMap<Shoe, Integer>(),
                                    new ArrayList<Employee>(),
                                    "George", "");
        while(true)
        {
            System.out.println("Chose command: 1.ChangeStoreName, 2.GetShoe, 3.AddShoe, 4.Restock, 5.HireEmployee, 6.FireEmployee, 7.Exit");
            String command = scan.nextLine();

            //1.ChangeStoreName
            if (command.equals("ChangeStoreName"))
            {
                System.out.println("Input new name: ");
                String name = scan.nextLine();
                store.setName(name);
            }

            // 2.GetShoe
            else if (command.equals("GetShoe"))
            {

            }

            //3.AddShoe
            else if (command.equals("AddShoe"))
            {
                var shoe = ReadShoe(scan);
                store.addShoe(shoe);
            }

            // 4.Restock,
            // 5.HireEmployee,
            // 6.FireEmployee

            // 7.Exit
            else if (command.equals("Exit"))
                break;
        }
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

        return new Shoe(price, model, brand, size, color, ID);
    }
}
