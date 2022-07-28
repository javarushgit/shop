package org.example.decorator;

public class TShort extends PersonDecorator
{

    @Override
    public String getClothes() {
        return person.getClothes() + " T-Short";
    }
}
