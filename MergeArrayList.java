import java.util.ArrayList;
import java.util.Scanner;

public class MergeArrayList {
    public static void main(String[]args){
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> lastNames = new ArrayList<String>();
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the list length:");
       int arrsize = sc.nextInt();
        System.out.println("Enter "+arrsize+" first names:");
        for(int i=0;i<arrsize;i++){
            names.add(sc.nextLine()); 
        }System.out.println("First names:"+names);

        System.out.println("Enter "+arrsize+" second names:");
        for(int j=0;j<arrsize;j++){
            lastNames.add(sc.nextLine()); 
        }System.out.println("second names:"+lastNames);

        for(int i=0;i<arrsize;i++){
                System.out.println("Your full name "+names.get(i)+" "+lastNames.get(i));
            }
        }
        }
