package org.example.decorator;

public class BrickHouse extends House
{
    {
        info = "Brick house ";
    }
    @Override
    public int getPrice() {
        System.out.println("Brick House");
        return 25000;
    }
}
