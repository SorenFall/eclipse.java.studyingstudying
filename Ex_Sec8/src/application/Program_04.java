package application;

import java.util.Locale;
import java.util.Scanner;

import ultil.CurrencyConverter;

public class Program_04 {
	void main() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?: ");
		CurrencyConverter.dolarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought?: ");
		CurrencyConverter.quantity = sc.nextDouble();
		System.out.print("Amount to be paid in reais = " + CurrencyConverter.realPrice());
		sc.close();
	}
}