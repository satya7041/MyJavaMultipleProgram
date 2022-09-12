package com.company;

import java.util.Scanner;

public class Cbseboardpercentage {
    public static void main(String args[])
        {

            int DSA, OOPs, OS, TAFL, DBMS;

            Scanner op = new Scanner(System.in);
            /* Input marks of given % Subjects */
            System.out.println("Enter the Marks of Five Subjects:");
            System.out.print("Enter the Marks of DSA: ");
            DSA = op.nextInt();
            System.out.print("Enter the Marks of OOPs: ");
            OOPs= op.nextInt();
            System.out.print("Enter the Marks of OS: ");
            OS=op.nextInt();
            System.out.print("Enter the Marks of TAFL: ");
            TAFL=op.nextInt();
            System.out.print("Enter the Marks of DBMS: ");
            DBMS=op.nextInt();
//calculating Total And Percentage
            int total=DSA+OOPs+OS+TAFL+DBMS;
            double percentage=(total/500.0)*100;
            /* Print all results */
            System.out.println("Total marks ="+total);
            System.out.println("Percentage = "+percentage);
        }
    }


