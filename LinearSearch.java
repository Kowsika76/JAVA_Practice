import java.util.Scanner;

public class LinearSearch {
    public static void main(String[]args){
        int i,j;
        System.out.println("Enter the array length:");
        Scanner sc = new Scanner(System.in);   
        int arrLen = sc.nextInt();

        int array[]= new int[arrLen];
        for(i=0;i<arrLen;i++){
            System.out.println("Enter the values at index "+i+":");
            array[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number to find:");
        int numFind = sc.nextInt();

        for(j=0;j<arrLen;j++){
            if(array[j]==numFind){
                System.out.println(numFind+" is found at the position "+(j+1));
                break;
            } }
            if(j==arrLen){
                System.out.println(numFind+" is not found in the list"); 
            
            }   
        }
    }
