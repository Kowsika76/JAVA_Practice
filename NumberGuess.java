package Loops;
import java.util.*;
public class NumberGuess {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int myNum = 50;
        for(int i=0;i<=5;i++)
        {
            System.out.println("Enter your number:");
            int num = sc.nextInt();
            if(num>myNum){
                System.out.println("Your number is greater than my number");
            } else if(num<myNum){
            System.out.println("Your number is lesser than my number");
            }else
            System.out.println("Congratulations!");
        }
    }
}
