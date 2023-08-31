package Loops;
import java.util.Scanner;
public class DollarRupees {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter dollars:");
		double dollars = scan.nextDouble();
		double rate = 82.59;
		double rupees = dollars * rate;
		System.out.println("The rupees for this "+dollars+" dollars is "+ rupees+" Rupees");

	}
}
