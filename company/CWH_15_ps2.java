package com.company;

import org.w3c.dom.ls.LSOutput;

public class CWH_15_ps2 {
    public static void main(String[] args) {
        // Problem 1
        String name = " Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text = "To My  Friend";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>","Pratik");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains  double and tripe spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harry, \n\tThis Java Course is nice.\nThanks!";
        System.out.println(myLetter);
    }
}
