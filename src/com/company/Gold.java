package com.company;

public class Gold implements Priceable {
     final int Price=36875;
    float weight;
    @Override
    public float getPrice(float weight)
    {
        if(weight<=1)
        {
            System.out.print("Меньше 1 кг" );
                    return weight*Price;

        }
        else
        {
            return weight*Price;
        }
    }

}
