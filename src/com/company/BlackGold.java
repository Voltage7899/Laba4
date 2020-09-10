package com.company;

public class BlackGold implements Priceable {
    final int Price=40;
    float weight;
    @Override
   public float getPrice(float weight)
    {
        if(weight<=1)
        {
            System.out.print("Меньше 1 барреля" );
            return weight*Price;

        }
        else
        {
                return weight*Price;
        }
    }

}
