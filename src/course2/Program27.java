package course2;

import java.util.Scanner;

public class Program27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How How many integer numbers are you going  to enter: ");
		
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Value # "+ i + ":");
			int x = sc.nextInt();
			sum += x;
			
		}
		
		System.out.println("Sum = " + sum);
		
		
		
		
		
	sc.close();	
		

	}

}
