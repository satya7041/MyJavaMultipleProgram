package com.company;

public class encryptgrade {
    public static void main(String[]args){
        //for encrypting
char grade='B';
grade=(char)(grade+8);
        System.out.println(grade);
// We can also print directly grade in encrypting way like that
        char Grade='B'+9;
        System.out.println(Grade);
        //for decrypting
        grade=(char)(grade-8);
        System.out.println(grade);

    }
}
