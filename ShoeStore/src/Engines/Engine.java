package Engines;

import Commands.*;
import Models.*;

import java.util.ArrayList;

public class Engine
{
    public static void Run()
    {
        var shoes = new ArrayList<Shoe>();
        Store store = new Store("ShoeStore",
                shoes,
                new ArrayList<Employee>(),
                "George", "");

        while(true)
        {
            System.out.println("Chose command: 1.ChangeStoreName, 2.GetShoe, 3.AddShoe, 4.Restock, 5.HireEmployee, 6.FireEmployee, 7.Exit");
            String commandName = Reader.ReadLine();

            Command command = new Command(commandName, store);
            command.Execute();


        }
    }
}
