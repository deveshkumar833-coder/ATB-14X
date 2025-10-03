package ex_05_Typecasting;

public class Lab058_typecasting_01 {
    public static void main(String[] args) {
        byte b = 10;
        //int a = b;    // Implicit casting -> Widening ->Automatuc done by jvm
        int a = (int) b; // explicit casting -> Widening ->Not required
    }
}
