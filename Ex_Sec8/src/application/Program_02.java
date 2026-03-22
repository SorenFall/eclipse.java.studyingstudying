package application;

import java.util.Locale;
import java.util.Scanner;

import entities.salary;

public class Program_02 {
	void main() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		salary salary = new salary();
		System.out.println("Enter employee data:");
		System.out.print("Name: ");
		salary.name = sc.nextLine();
		System.out.print("Salary: ");
		salary.salary = sc.nextDouble();
		System.out.print("Tax: ");
		salary.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", salary.name, salary.liquido());
		
		System.out.print("Which percentage to increase salary? ");
		salary.percentage = sc.nextDouble();
		
		System.out.printf("Updated Data: %s, $ %.2f", salary.name, salary.newLiquido());
		sc.close();
	}
}