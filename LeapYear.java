package Loops;
import java.util.*;
 class LeapYear {
    public static void main(String[]args){
         System.out.println("Print the year");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year%4==0 || year%400==0 && year%100!=0){
            System.out.println("The year "+year+ " is leap year");
        }else
            System.out.println("The year "+year+ " is not an leap year");

    }
}