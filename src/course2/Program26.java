package course2;

import java.util.Locale;
import java.util.Scanner;

public class Program26 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter a number: ");
		double n = sc.nextDouble();
		
		while (n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n",sr);
			System.out.println("Enter another  number: ");
			n = sc.nextDouble();
		}
			System.out.println("Negative number");
		sc.close();

	}

}
