package org.example.decorator;

public class Garden extends HouseDecorator
{
    {
        info = getInfo() +  " Garden";
    }

    public Garden(House house) {
        super(house);
    }

    @Override
    public int getPrice() {
        int price = house.getPrice() + 3000;
        System.out.println("Garden");
        return price;
    }
}
