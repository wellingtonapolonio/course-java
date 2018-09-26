package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exer5 {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int num = sc.nextInt();
		
		for(int i =1; i <= num; i++) {
			System.out.println("Employee # "+ i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			 list.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		System.out.print("Enter the percentage: ");
		
		Employee empX = list.stream().filter(x ->  x.getId() == id).findFirst().orElse(null);
		if (empX == null) {
			System.out.print("This id does not exist!");
			
		}
		else {
			System.out.print("Enter the percentage:");
			double percentage = sc.nextDouble();
			empX.increaseSalary(percentage);
		
		}
		System.out.println();
		System.out.println("List of employees:");
		for (Employee y : list) {
			System.out.println(y);
		}
		
		sc.close();

	}

}
