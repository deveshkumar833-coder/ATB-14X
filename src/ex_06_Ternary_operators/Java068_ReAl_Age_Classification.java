package ex_06_Ternary_operators;

public class Java068_ReAl_Age_Classification {
    public static void main(String[] args) {
        String user_input = args[0];
        //String up2 = args[1];
        //String up3 = args[2];
          System.out.println(user_input);
          System.out.println(user_input instanceof String);
        //System.out.println(up3);
        int age = Integer.parseInt(user_input);
        String Result = age < 18 ? "Minor" : (age <= 60 ? "Adult" : "SR.Citizen");
        System.out.println(Result);

    }
}
