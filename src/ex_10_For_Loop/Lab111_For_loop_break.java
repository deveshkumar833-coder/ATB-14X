package ex_10_For_Loop;

public class Lab111_For_loop_break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // print 0 -49 and run 50 times
            //System.out.println(i);   // 0 to 5
            if(i == 5){
                break;
            }
            System.out.println(i);   // Print 0 to 4

        }
    }
}
