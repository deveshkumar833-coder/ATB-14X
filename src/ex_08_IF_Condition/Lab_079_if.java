package ex_08_IF_Condition;

public class Lab_079_if {
    public static void main(String[] args) {
        String user_input = args[0];
        System.out.println(user_input);
        int age = Integer.parseInt(user_input);
        System.out.println(age);

        if(age > 18)
        {
            System.out.println("Yes you can vote");
        }

        else
        {
            System.out.println("Yes you can't vote");

        }

    }
}
