package Loops;
import java.util.Scanner;
public class ReverseSum {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:");
    int num = sc.nextInt();
    int rev=0;
    int sum =0;
    do {
        int rem=num%10;
        rev=rev*10+rem;
        sum=sum+rem;
        num=num/10;
    } 
    while(num>0);
    System.out.println("The reversed number "+rev);
    System.out.println("Sum of that digits is "+sum);
}
}
