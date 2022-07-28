package org.example.decorator;

public class WoodenHouse extends House
{

    {
        info = "WoodenHouse ";
    }
    @Override
    public int getPrice() {
        System.out.println("Wooden house");
        return 15000;
    }
}
