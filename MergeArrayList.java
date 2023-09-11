import java.util.ArrayList;
import java.util.Scanner;

public class MergeArrayList {
    public static void main(String[]args){
        ArrayList<String> firstNames = new ArrayList<String>();
        ArrayList<String> lastNames  = new ArrayList<String>();
        ArrayList<String> fullNames  = new ArrayList<String>();
       Scanner sc = new Scanner(System.in);

      //System.out.println("Enter the list length:");
       //int length = sc.nextInt();
        int length = 5;
        System.out.println("Enter first "+length+" names:");
        for(int i=0;i<length;i++){
            firstNames.add(sc.nextLine()); 
        }System.out.println("First names:"+firstNames);


        System.out.println("Enter second "+length+" names:");
        for(int j=0;j<length;j++){
            lastNames.add(sc.nextLine()); 
        }System.out.println("second names:"+lastNames);

        
        for(int i=0;i<length;i++){
                fullNames.add(firstNames.get(i)+" "+lastNames.get(i));
               // System.out.println(fullName);
            }
        System.out.println("-------Your full name--------- ");
        for(String fullName : fullNames){
            System.out.println(fullName);
        }
            sc.close();
        }
        }
