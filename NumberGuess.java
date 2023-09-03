package Loops;

import java.util.Random;
import java.util.Scanner;
public class NumberGuess {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int myNum = random.nextInt(100);
        System.out.println("You have 5 chances");
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter your number between 1-100:");
            int num = sc.nextInt();
            if(num>myNum){
                System.out.println("Your number is greater than my number");
            } else if(num<myNum){
            System.out.println("Your number is lesser than my number");
            }else {
            System.out.println("Congratulations!"); 
            break;
        }
        } sc.close();
    }
}