package ex_06_Ternary_operators;

public class Lab64_Interview_ready_questions {
    public static void main(String[] args) {

        // Nested ternary

        int age =25;
        String result = age > 18 ? (age>23 ? "You can drink" : "You can't drink") : "No";
        System.out.println(result);
    }
}
