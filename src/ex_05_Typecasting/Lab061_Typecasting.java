package ex_05_Typecasting;

public class Lab061_Typecasting {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
         //int total = course+GST; // Narrowing casting -> implicit ---Not valid
        //int total = course+(int)GST; // Narrowing casting -> EXplicit --- valid nut Data loss
        //System.out.println(total);
        //System.out.printf("Total course %d with GST %d = %d", course,(int)GST,total);


        float total = course+GST; // WIDENING CASTING -> Implicit casting ->Valid
        System.out.println(total);
    }
}
