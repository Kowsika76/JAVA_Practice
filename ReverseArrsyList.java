import java.util.*;
public class ReverseArrsyList {
    public static void main(String[]args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the list length:");
       int arrsize = sc.nextInt();

       System.out.println("Enter "+arrsize+" numbers:");
        for(int i=0;i<arrsize;i++){
            numbers.add(sc.nextInt()); 
        }System.out.println("Before reverse:"+numbers);
        System.out.println("After reverse: ");
        for(int i=numbers.size()-1;i>=0;i--){
            System.out.println(numbers.get(i));
        } sc.close();
    }
}
