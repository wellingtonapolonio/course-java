package course2;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("heigher: " + n1);
		}else if (n2 > n3) {
			System.out.println("heigher: " + n2);
		}else {
			System.out.println("heigher: " + n3);
		}
		sc.close();

	}

}
