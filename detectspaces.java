package com.company;

public class detectspaces {
    public static void main(String args[]){
        String Satya="Dear Satyam, You have been  shortlisted for JAVA Developer";
        //now detect that if there is any double and triple spaces or not
        System.out.println(Satya.indexOf("  "));//this code search for double spaces
        System.out.print(Satya.indexOf("   "));//and this code search for triple spaces
    }
}
