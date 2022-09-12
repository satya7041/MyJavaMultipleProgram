package com.company;

public class stringforfillingnewletter {
    public static void main(String args[]){
        String letter="Dear <|Name|>,Thanks a lot.";
        letter=letter.replace("<|Name|>","Satyam");
        System.out.println(letter);
    }
}
