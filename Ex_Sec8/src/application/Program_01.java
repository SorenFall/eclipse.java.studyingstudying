package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class Program_01 {
	void main() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");
		
		rectangle x;
		x = new rectangle();
		
		x.x = sc.nextDouble();
		x.y = sc.nextDouble();
		
		Double area = x.area();
		Double peri = x.peri();
		Double diag = x.diag();
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PERIMETER = %.2f%n", peri);
		System.out.printf("DIAGONAL = %.2f%n", diag);
		
		sc.close();
	}
}
