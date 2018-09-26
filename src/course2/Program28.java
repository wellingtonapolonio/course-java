package course2;

import java.util.Locale;
import java.util.Scanner;

public class Program28 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		char resp;
		do {
			double n = sc.nextDouble();
			double sq  = Math.sqrt(n);
			System.out.printf("Square root = %.3f%n",sq);
			System.out.print("Repeat (y/n): ");
			resp = sc.next().charAt(0);
		}while (resp != 'n');
			
		sc.close();

	}

}
