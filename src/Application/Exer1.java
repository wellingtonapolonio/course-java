package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;


public class Exer1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		
		Rectangle x;
		x = new Rectangle();
		x.width  = sc.nextDouble();
		x.height = sc.nextDouble();
		
		
		double areaX = x.Area();
		double perimeterX = x.Perimeter();
		double diagonalX = x.Diagonal();
		
		System.out.printf("Area = %.2f%n", areaX);
		System.out.printf("Perimeter = %.2f%n", perimeterX);
		System.out.printf("Diagonal = %.2f%n", diagonalX);
		
		sc.close();	
	}

}
