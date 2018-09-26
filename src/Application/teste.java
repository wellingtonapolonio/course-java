package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Rentend;

public class teste {

	public static void main(String[] args) {
		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			List<Rentend>list = new ArrayList<>();
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
				list.add(new Rentend(name,email));
				
				
			
		}
			System.out.println();
			System.out.print("Busy rooms: ");
			for (Rentend x : list) {
				System.out.println(x);
			}
			sc.close();
		
		

	}catch (NumberFormatException erro) {
		System.out.println("\n" + 
				"There was an error, just enter numeric characters"+ erro.toString());
	}
		
		
		
	}
	}
