package application;

import java.util.Locale;
import java.util.Scanner;

import entities.note;

public class Program_03 {
	void main() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		note note = new note();
		System.out.println("Enter student data:");
		System.out.print("Name: ");
		note.name = sc.nextLine();
		System.out.print("Note 2: ");
		note.n1 = sc.nextDouble();
		System.out.print("Note 3: ");
		note.n2 = sc.nextDouble();
		System.out.print("Note 3: ");
		note.n3 = sc.nextDouble();
		
		System.out.println(note.result());

		sc.close();
	}
}