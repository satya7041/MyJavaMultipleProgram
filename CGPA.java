package com.company;

import java.util.Scanner;

public class CGPA {
    public static void main(String args[])
    {
        int OOPs,DBMS,OS,TAFL,DSA;
        Scanner sh=new Scanner(System.in);
        System.out.println("Enter the Marks of five Subjects: ");
        System.out.print("Enter the mark of OOPs: ");
        OOPs=sh.nextInt();
        System.out.print("Enter the mark of DBMS: ");
        DBMS=sh.nextInt();
        System.out.print("Enter the mark of OS: ");
        OS= sh.nextInt();
        System.out.print("Enter the mark of TAFL: ");
        TAFL=sh.nextInt();
        System.out.print("Enter the mark of DSA: ");
        DSA=sh.nextInt();
        //Now Calculating Total,Percentage And CGPA
        int total=OOPs+DBMS+OS+TAFL+DSA;
        double percentage=(total/500.0)*100;
        double CGPA=percentage/9.5;
        //print all result
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage is: "+percentage);
        System.out.print("The CGPA is: "+CGPA);

    }
}
