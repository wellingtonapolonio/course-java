package course2;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int x = a, y = b;
		if (x < b) {
			x = a;
			y = b;
		}
		
		int sum = 0;
		
		for (int i = x; i < y ; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
			
			
		}
		
		System.out.println("Sum of odd numbers = "+ sum);
		sc.close();

	}

}
