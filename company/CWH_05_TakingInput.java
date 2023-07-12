package com.company;
import java.util.Scanner;                     // Importing the Scanner class

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner(System.in);  // Creating an object named "sc" of the Scanner (Read from the keyboard)
        System.out.println("Enter num 1");
        int a = sc.nextInt();                 //(Method to read from the keyboard)
        System.out.println("Enter num 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these no.s is ");
        System.out.println(sum);
    }
}


//package com.company;
//import java.util.Scanner;
//
//public class CWH_05_TakingInput {
//    public static void main(String[] args) {
//        System.out.println("Taking Input From The User");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter num 1");
//        float a = sc.nextFloat();
//        System.out.println("Enter num2");
//        float b = sc.nextFloat();
//        float sum =  a+b;
//        System.out.println("The sum of these no.s is");
//        System.out.println(sum);
//    }
//}


//package com.company;
//import java.util.Scanner;
//
//public class CWH_05_TakingInput {
//    public static void main(String[] args) {
//        System.out.println("Taking Input From The User");
//        Scanner sc = new Scanner(System.in);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//    }
//}


//package com.company;
//import java.util.Scanner;
//
//public class CWH_05_TakingInput {
//    public static void main(String[] args) {
//        System.out.println("Taking Input From The User");
//        Scanner sc = new Scanner(System.in);
//        boolean b1 = sc.hasNextFloat();
//        System.out.println(b1);
//    }
//}



//package com.company;
//import java.util.Scanner;
//
//        public class CWH_05_TakingInput {
//            public static void main(String[] args) {
//                System.out.println("Taking Input From The User");
//                Scanner sc = new Scanner(System.in);
////                String str = sc.next();       //Prints only first word from the line
//                String str = sc.nextLine();     //Prints whole line
//                System.out.println(str);
//    }
//}
