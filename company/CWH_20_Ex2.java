//package com.company;
//import java.util.Random;
//import java.util.Scanner;
//public class CWH_20_Ex2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random rand = new Random();
//
//    }
//
//}

import java.util.Random;
import java.util.Scanner;

public class CWH_20_Ex2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Enter your choice (rock, paper, or scissors): ");
        String userChoice = sc.next().toLowerCase();

        // Check if the user's choice is valid
        if (!isValidChoice(userChoice)) {
            System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
            return;
        }

        // Generate a random choice for the computer
        int randIndex = rand.nextInt(choices.length);
        String computerChoice = choices[randIndex];

        System.out.println("Computer's choice: " + computerChoice);

        // Determine the winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
                userChoice.equals("paper") && computerChoice.equals("rock") ||
                userChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    // Helper method to check if the user's choice is valid
    public static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }
}
