package Practice.help;

import java.util.Scanner;

public class AGE {

    public static void main(String[] args) {
        System.out.println("Enter your age");
        try{
           int age=new Scanner(System.in).nextInt();
       }
       catch (RuntimeException ie){
            System.out.println("Only number are allowed");
        }
        //System.out.println("Your age is "+age);

        }
}
