import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String reverse=" ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to reverse:");
        String name = sc.nextLine();
        for(int i =0;i<name.length();i++){
           char letter = name.charAt(i);
           reverse = letter+reverse;
        }
        System.out.println("Reversed string: "+ reverse);
    sc.close();
}
}