package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Score;

public class Exer3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Score score = new Score();
		System.out.print("Enter name: ");
		score.name = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Score");
		score.a = sc.nextDouble();
		score.b = sc.nextDouble();
		score.c = sc.nextDouble();
		
		double finalgrade = score.FinalGrade();
		
		if (finalgrade >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			//System.out.printf("MISSING %.2f POINTS%n",finalgrade);
		}
		

	}

}
