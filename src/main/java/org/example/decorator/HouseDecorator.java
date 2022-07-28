package org.example.decorator;

public abstract class HouseDecorator extends House
{
    House house;

    public HouseDecorator(House house) {
        this.house = house;
    }
}
