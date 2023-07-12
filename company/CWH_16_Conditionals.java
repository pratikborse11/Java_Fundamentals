package com.company;

public class CWH_16_Conditionals {
    public static void main(String[] args) {
        int age = 18;
        boolean cond = (age == 18);  // if this condition is true then only it will go in IF otherwise it will go in ELSE

        if(cond){
            System.out.println("Yes, you are eligible to drive!");
        }
        else{
            System.out.println("No, you are not eligible to drive!");
        }
    }
}
