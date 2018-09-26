package Application;

import java.util.Locale;
import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int [][] mat = new int[n][n];
			

				for (int i = 0; i<mat.length; i++) {
				for (int j = 0; j<mat[i].length; j++) {
					mat [i][j]= sc.nextInt();
				}
			}
				int numX = sc.nextInt();
				
				for (int i =0;i <mat.length;i++) {
					for (int j =0; j<mat[i].length; j++) {
						if (mat[i][j]==numX) {
							System.out.println("Position "+ i + ","+ j + ":");
						}if (j > 0) {	

							System.out.println("Left: "+ mat[i][j-1]);
						}if (i > 0) {
							System.out.println("UP: "+ mat[i-1][j]);
						}if (j< mat[i].length-1) {
							System.out.println("Right: "+ mat[i][j+1]);
						}if (i <  mat.length-1) {
							System.out.println("Down: "+ mat[i+1][j]);
						}else {
							System.out.println(numX);
						}
							
						}
					}
				sc.close();
		
		}catch (NumberFormatException erro) {
			System.out.println("\n" + 
					"There was an error, just enter numeric characters"+ erro.toString());
		}
			
			
				
				
	}

}
