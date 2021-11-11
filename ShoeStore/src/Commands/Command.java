package Commands;

import Engines.Reader;
import Models.*;

import java.util.stream.Collectors;

public class Command
{
    private static String commandName;
    private static Store store;
    public Command(String name, Store store)
    {
        this.commandName = name;
        this.store = store;
    }

    public static void Execute()
    {
        if (commandName.equals("ChangeStoreName"))
        {
            ChangeStoreName();
        }

        // 2.GetShoe
        else if (commandName.equals("GetShoe"))
        {
            GetShoe();
        }

        //3.AddShoe
        else if (commandName.equals("AddShoe"))
        {
            AddShoe();
        }

        // 4.Restock,
        else if (commandName.equals("Restock"))
        {
            Restock();
        }

        // 5.HireEmployee,
        else if (commandName.equals("HireEmployee"))
        {
            HireEmployee();
        }
        // 6.FireEmployee
        else if (commandName.equals("FireEmployee"))
        {
            FireEmployee();
        }

        // 7.Exit
        else if (commandName.equals("Exit"))
        {
            System.exit(0);
        }
    }

    private static void FireEmployee()
    {
        System.out.println("Input ID: ");
        String ID = Reader.ReadLine();
        store.FireEmployee(ID);
    }

    private static void HireEmployee()
    {
        Employee employee = Reader.ReadEmployee();
        store.HireEmployee(employee);
    }

    private static void Restock()
    {
        System.out.println("Enter ID");
        var ID = Reader.ReadLine();

        System.out.println("Enter new deliveries");
        var restockedNumber = Integer.parseInt(Reader.ReadLine());

        var shoe = (Shoe)store.getShoes().stream()
                .filter(x -> x.getID().equals(ID))
                .map(x -> (Shoe)x);

        shoe.setQuantity(shoe.getQuantity() + restockedNumber);
    }

    private static void AddShoe()
    {
        var shoe = Reader.ReadShoe();
        store.addShoe(shoe);
    }

    private static void GetShoe()
    {
        System.out.println("Enter ID");
        var ID = Reader.ReadLine();
        var shoe =  store.getShoes().stream()
                .filter(x -> x.getID().equals(ID))
                .map(x -> (Shoe)x)
                .collect(Collectors.toList())
                .stream().findFirst();
        System.out.println(shoe);
    }

    private static void ChangeStoreName()
    {
        System.out.println("Input new name: ");
        String name = Reader.ReadLine();
        store.setName(name);
    }
}
