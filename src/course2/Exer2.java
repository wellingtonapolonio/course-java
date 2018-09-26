package course2;

import java.util.Locale;
import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students:");
		
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print("Student # "+ i + ":");
			double Score1 = sc.nextDouble();
			double Score2 = sc.nextDouble();
			double Score3 = sc.nextDouble();
			double finalScore = Score1 + Score2 + Score3;
			System.out.printf("finalScore: %.2f%n", finalScore);
		}
		sc.close();
	}

}
