package com.company;

import java.util.Scanner;

public class convertkm2miles {
    public static void main(String args[]){
        Scanner pg=new Scanner(System.in);
        double kilo;
        System.out.println("Enter the unit to Convert Kilometers to Miles: ");
        kilo=pg.nextDouble();
        //now Converting the kilo to miles
    double Kilometer=kilo*0.62137;
    System.out.print("The Conversion of Kilometers to Miles is: "+Kilometer);
    }
}
