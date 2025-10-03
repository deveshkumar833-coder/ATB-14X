package ex_05_Typecasting;

public class Lab060_Typecasting {
    public static void main(String[] args) {
        long phone_no = 90345670l;
        //short b = phone_no;  // Narrowing casting -> Impllcit -> Not valid
        short s = (short) phone_no;
        System.out.println(s);

    }
}
