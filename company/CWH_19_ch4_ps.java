package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class CWH_19_ch4_ps {
    public static void main(String[] args) {

        // QUESTION 1
        /*
        int a = 10;
        if (a=11){               // in if statement we cannot assign values
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }

         */


        // QUESTION 2
//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter your marks in Physics: ");
//        m1 = sc.nextByte();
//
//        System.out.print("Enter your marks in Chemistry: ");
//        m2 = sc.nextByte();
//
//        System.out.print("Enter your marks in Mathematics: ");
//        m3 = sc.nextByte();
//
//        float avg = (m1 + m2 + m3)/3.0f;
//        System.out.println(avg);
//
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations! You have been promoted.");
//        }
//        else {
//            System.out.println("Sorry, you have not been promoted. Please try again.");
//        }


        // QUESTION 3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your Salary : ");
//        float tax = 0;
//        float income = sc.nextFloat();
//
//        if(income <= 2.5){
//            tax = tax + 0;
//        }
//        else if(income > 2.5f && income <= 5.0f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income > 5.0f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5.0f);
//        }
//        else if(income > 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5.0f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by Employee is: " + tax);


        //QUESTION 4
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the no.: ");
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        //QUESTION 5




        //QUESTION 6
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the website : ");
        String website = sc.next();

        if(website.endsWith(".org")){
            System.out.println("This is an organizational website.");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a commercial website.");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website.");
        }

    }

}
