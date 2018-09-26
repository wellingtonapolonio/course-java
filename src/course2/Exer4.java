package course2;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer value:");
		int num = sc.nextInt();
		int result = 0;
		
		while (num != 0) {
			result = num *num ;
			System.out.println(result);
			System.out.print("Enter an integer value:");
			num = sc.nextInt();
		}
		
		sc.close();

	}

}
