package course;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what time is it?");
		
		int time = sc.nextInt();
		
		if (time < 12) {
			System.out.println("Good Morning!");
		}else if (time < 18 ) {
			System.out.println("Good afternoon!");
		}else {
			System.out.println("Good envening!");
		}
		
		sc.close();

	}

}
