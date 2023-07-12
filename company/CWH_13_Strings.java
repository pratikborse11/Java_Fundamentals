package com.company;
import java.util.Scanner;

public class CWH_13_Strings {
    public static void main(String[] args) {
//        String name = new String("Pratik");
//        String name = "Pratik";
//        System.out.print("The name is: ");
//        System.out.println(name);
        int a = 6;
        float b = 5.6454f;
//        System.out.printf("The value of a is %d and the value of b is %f", a, b);        //printf
//        System.out.printf("The value of a is %d and the value of b is %8.2f", a, b);
        System.out.format("The value of a is %d and the value of b is %f", a, b);           //format
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the string");
//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);

    }
}