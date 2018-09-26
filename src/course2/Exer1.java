package course2;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three student scores: ");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double finalScore = nota1 + nota2 + nota3;
		
		System.out.printf("%.3f%n",finalScore);
		
		if (finalScore < 60.00) {
			System.out.println("FAILED");
		}
		sc.close();
	}

}
