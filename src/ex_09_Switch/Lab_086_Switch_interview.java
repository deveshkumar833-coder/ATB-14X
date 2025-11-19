package ex_09_Switch;

import java.util.Scanner;

public class Lab_086_Switch_interview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");
        if(scanner.hasNextInt()){
            int day = scanner.nextInt();
            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;

            }

        }
        else {
            System.out.println("You are fool!");
        }

    }
}

