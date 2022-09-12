package com.company;

import java.util.Scanner;

public class Sum3numbers {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sa=new Scanner(System.in);
        System.out.println("Enter the Three Numbers for sum: ");
        System.out.print("Enter the first number: ");
        a=sa.nextInt();
        System.out.print("Enter the Second Number: ");
        b=sa.nextInt();
        System.out.print("Enter the Last Number: ");
        c=sa.nextInt();
        //Now calculating total
       int total=a+b+c;
        System.out.print("The Sum of Three Integers are: " +total);
    }
}
