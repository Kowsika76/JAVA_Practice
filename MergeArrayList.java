import java.util.ArrayList;
import java.util.Scanner;

public class MergeArrayList {
    public static void main(String[]args){
        ArrayList<String> firstNames = new ArrayList<String>();
        ArrayList<String> lastNames  = new ArrayList<String>();
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

        System.out.println("-------Your full name--------- ");
        for(int i=0;i<length;i++){
                String fullName= firstNames.get(i)+" "+lastNames.get(i);
                System.out.println(fullName);
            }sc.close();
        }
        }
