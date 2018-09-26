package course2;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N:");
		
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.print("N must be positive! Try again: ");
			num = sc.nextInt();
		}
		int higher = Integer.MIN_VALUE;
		for (int i = 1; i <= num; i++) {
			System.out.print("Value # "+ i + ":");
			int y = sc.nextInt();
			if (y > higher) {
				higher = y;
			}
		
		}
		System.out.println("Higher:  " + higher);
		sc.close();
	}

}
