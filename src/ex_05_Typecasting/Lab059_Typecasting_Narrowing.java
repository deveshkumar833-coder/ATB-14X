package ex_05_Typecasting;

public class Lab059_Typecasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
       // byte b = val;  // Narrowing casting -> Implicit -> Not valid

        byte b1 = (byte) val; // Narrowing casting -> Explicit ->  valid


    }
}
