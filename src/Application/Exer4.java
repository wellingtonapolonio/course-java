package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rentend;

public class Exer4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rentend[] vect = new Rentend[10];
		System.out.print("How many rooms will be rented?");
		int num = sc.nextInt();
		
		
		for (int i = 1; i < num ; i++) {
			System.out.println();
			System.out.println("Rent # " + i+ ": ");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int Room = sc.nextInt();
			vect[Room] = new Rentend(name,email);
		}
		System.out.println();
		System.out.print("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":"+ vect[i]);
			}
		}
		
		
		sc.close();

	}

}
