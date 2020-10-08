package Practice.help;

import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
       System.out.println("Enter you score");
       int score=new Scanner(System.in).nextInt();
       if (score<45) {
           System.out.println("3rd Division");
       } else if ((score >= 45) && (score < 60)) {
           System.out.println("2nd Division");
        } else {
            System.out.println("1st Division");
        }

       }
               }



