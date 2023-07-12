package com.company;

public class CWH_14_string_methods {
    public static void main(String[] args) {
        String name = "Harry";
//        System.out.println(name);
        int value = name.length();
//        System.out.println(value);

//        String lstring = name.toLowerCase();
//        System.out.println(lstring);

//        String ustring = name.toUpperCase();
//        System.out.println(ustring);

//        String nonTrimmedString = "    Harry     ";
//        System.out.println(nonTrimmedString);
//
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);

//        System.out.println(name.substring(2));
//        System.out.println(name.substring(1,5));

//        System.out.println(name.replace("r", "p"));
//        System.out.println(name.replace("r", "ier"));

//        System.out.println(name.startsWith("Ha"));
//        System.out.println(name.endsWith("ry"));

//        System.out.println(name.charAt(4));

        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry",4));
        System.out.println(modifiedName.lastIndexOf("rry",4));

        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HaRrY"));

//        System.out.println("I am escape sequence \ndouble quote");
//        System.out.println("I am escape sequence \tdouble quote");
//        System.out.println("I am escape sequence \'double quote");
//        System.out.println("I am escape sequence \\double quote");
    }
}
