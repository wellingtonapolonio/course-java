package Application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class DollarCoventer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("What is the dollar price? %.2f%n", CurrencyConverter.DOLLAR);
		System.out.print("How many dollars will be bought?" );
		double value = sc.nextDouble();
		double x = CurrencyConverter.MonyValor(value);
		
		System.out.printf("Amount to be paid in reais = %.2f", x);
		sc.close();
		

	}

}
