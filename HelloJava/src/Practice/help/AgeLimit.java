package Practice.help;

import java.util.Scanner;

public class AgeLimit {
        public static void main(String[] args) {
            System.out.println("Enter you age");
            int age=new Scanner(System.in).nextInt();
            if (age<13) {
                System.out.println("Too young to create FB account");
            } else if (age<16) {
                System.out.println("Too young to get a Driver's License");
            } else if (age<18){
                System.out.println("Too young to get a tattoo");
            } else if (age<21){
                System.out.println("Too young to drink");
            } else if (age<35){
                System.out.println("You cant run for President");
            }

        }


}
