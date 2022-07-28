package org.example.decorator;

//import org.example.iopac.*;

import java.util.Scanner;

public class SomeClass
{
    public static void main(String[] args)
    {
        House house = new WoodenHouse();
        house = new Garage(house);
        house = new Garden(house);
        System.out.println(house.getPrice());

    }
}
