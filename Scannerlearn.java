package com.company;

import java.util.Scanner;

public class Scannerlearn {
    public static void main(String[]args){
System.out.println("Taking input from the user");
Scanner sc= new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a=sc.nextInt();
        System.out.println("Enter number 2: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The Sum of 2 numbers is: ");
        System.out.println(sum);
    }
}
