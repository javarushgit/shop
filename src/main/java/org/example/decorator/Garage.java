package org.example.decorator;

public class Garage extends HouseDecorator
{

    Garage(House house)
    {
        super(house);
    }

    {
        info = getInfo() +  " Garage";
    }
    @Override
    public int getPrice() {
        int price = house.getPrice() +5000;
        System.out.println("Garage");

        return price;
    }
}
