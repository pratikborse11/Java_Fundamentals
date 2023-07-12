package com.company;

public class CWH_22_do_while {
    public static void main(String[] args) {
//        int a = 0;
//        while(a<5) {       //(while loop >> first check >> then execute)
//            System.out.println(a);
//            a++;
//        }

        int b = 10;
        do{                   //(do-while loop >> first execute >> then check)
            System.out.println(b);
            b++;
        }while(b<5);

        int c = 1;
        do{                                     //to print first n natural no.s
            System.out.println(c);
            c++;
        }while(c<=11);
    }
}
