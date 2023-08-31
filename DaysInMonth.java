package Loops;
import java.util.*;
public class DaysInMonth {
    public static void main(String [] args)
    {
    String monthName;
    System.out.println("Enter Month in number and Year");
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    int year = sc.nextInt();
    switch(month){
        case 1: monthName ="January";
        case 3: monthName ="March";
        case 5: monthName ="May";
        case 7: monthName ="July";
        case 8: monthName ="August";
        case 10: monthName ="October";
        case 12: monthName ="December";
        System.out.println(monthName+" " +year + " has 31 days");
        break;
        case 4: monthName ="April";
        case 6: monthName ="June";
        case 9: monthName ="September";
        case 11: monthName ="November";
        System.out.println(monthName+" " +year + " has 30 days");
        break;
        case 2: monthName = "February";
        if (year%4==0 || year%400==0 && year%100!=0){
                    System.out.println(monthName+" " +year + " has 29 days");
        }else
                    System.out.println(monthName+" " +year + " has 28 days");
            break;
        default:
            System.out.println("Invalid");

    }
    }
}
