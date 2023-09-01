package Loops;
import java.util.*;
public class DecimalBinary {
    public static void main(String[]args){
        System.out.println("Enter the decimal number:");
        Scanner sc = new Scanner (System.in);
        int decimalNum = sc.nextInt();
        String binary="";
        while(decimalNum>0){
            binary=(decimalNum%2)+binary;
            decimalNum = decimalNum/2;
        }System.out.println("The binary for that decimal is "+binary);
    }
}