package org.example.decorator;

public class Jacket extends PersonDecorator{
    @Override
    public String getClothes() {
        return person.getClothes()  + " Jacket";
    }
}
