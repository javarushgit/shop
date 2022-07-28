package org.example.decorator;

public class SecondFloor extends HouseDecorator
{
    {
        info = getInfo() +  " SecondFloor";
    }

    public SecondFloor(House house) {
        super(house);
    }

    @Override
    public int getPrice() {
        int price = house.getPrice() + 10000;
        System.out.println("SecondFloor");
        return price;
    }
}
