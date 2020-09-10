package com.company;

public class Main {

    public static void main(String[] args) {
        Priceable g=new Gold();
        Priceable go=new Gold();
        System.out.println("Price  is "+g.getPrice(0.5f));
        System.out.println(" Price  is "+go.getPrice(20));
        Priceable b=new BlackGold();
        Priceable bl=new BlackGold();
        System.out.println(" Price  is "+b.getPrice(0.5f));
        System.out.println("Price  is "+bl.getPrice(20));


    }
}