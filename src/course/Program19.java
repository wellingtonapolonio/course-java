package course;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number");
		
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("even!");
		}else {
			System.out.println("odd!");
		}
		
		sc.close();
	}

}
