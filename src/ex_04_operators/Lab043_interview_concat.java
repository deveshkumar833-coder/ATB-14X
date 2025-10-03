package ex_04_operators;

public class Lab043_interview_concat {
    public static void main(String[] args) {
        String Firstname = "Pramood";
        String Lastname =  "Dutta";

        int a=10, b=10;

        System.out.println(Firstname+Lastname+a+b);
        System.out.println(a+b+Firstname+Lastname);

        System.out.println(Firstname+Lastname+(a+b));

    }
}
