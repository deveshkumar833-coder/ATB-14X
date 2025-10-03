package ex_06_Ternary_operators;

public class Lab067_TO_Three_MAX {
    public static void main(String[] args) {
        int n1 =2, n2= 9, n3 =-11;

        int max;
        max= n1>n2 ? n1>n3 ? n1:n3: n2>n3? n2:n3;

        System.out.printf("MAX Number is %d",max);
    }
}
