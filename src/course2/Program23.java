package course2;

//import java.util.Scanner;

public class Program23 {
	public static void main(String[] args) {
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		System.out.println(desconto);
		
	}

}
