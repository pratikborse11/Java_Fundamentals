package com.company;

public class CWH_12_ps2_ps02 {
    public static void main(String[] args) {
        char grade = 'B';
        grade =(char) (grade + 8); // Forcefully casting one datatype into another datatype
        System.out.println(grade);

        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
