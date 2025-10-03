package ex_04_operators;

import java.sql.SQLOutput;

public class Lab042_interview_concat {
    public static void main(String[] args) {
        // + - Arithmatic operation
        int a = 10;
        int b = 20;
        System.out.println(a+b);


        // + operator with strings data types works as a concatination of string
        // this is called operator overriding

        String Firstname = "Devesh";
        String Lastname =  "Kumar";
        System.out.println(Firstname + " "+ Lastname);
    }
}
