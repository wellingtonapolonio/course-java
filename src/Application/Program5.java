package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produt;

public class Program5 {


		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Produt P = new Produt();
			
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			Produt produt = new Produt(name,price);
			
			
			System.out.println();
			System.out.println("Product data: " + produt);
			System.out.println();
			System.out.print("Enter the number of products to be added in stock: ");
			int quantity = sc.nextInt();
			
			
			produt.addProducts(quantity);
			System.out.println();
			System.out.println("Updated data: " + produt);
			System.out.println();
			System.out.print("Enter the number of products to be removed from stock: ");
			quantity = sc.nextInt();
			produt.removeProducts(quantity);
			System.out.println();
			System.out.println("Updated data: " + produt);
			sc.close();

	}

}
