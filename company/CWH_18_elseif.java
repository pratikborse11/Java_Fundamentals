package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        String var = "Pratik";

        switch (var) {
            case "Pratik" -> {
                System.out.println("You're are going to join a job!");
                System.out.println("You're are going to join a job!");
                System.out.println("You're are going to join a job!");
            }
            case "Shubham" -> System.out.println("You're going to become an adult!");
            case "Tejas" -> System.out.println("You're going to get retired!");
            default -> System.out.println("Enjoy your day!");
        }
        System.out.println("Thanks for using my JAVA code!");


        /*
        int age;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("You're going to become an adult!");
                break;
            case 23:
                System.out.println("You're are going to join a job!");
                break;
            case 60:
                System.out.println("You're going to get retired!");
                break;
            default:
                System.out.println("Enjoy your day!");

        }
        System.out.println("Thanks for using my JAVA course!");

         */




        /*
        int age ;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You're are experienced");
        }
        else if (age>46) {
            System.out.println("You're are semi-experienced");
        }
        else if (age>36) {
            System.out.println("You're are semi-semi-experienced");
        }
        else{
            System.out.println("You're are not experienced");
        }
         */


    }
}
