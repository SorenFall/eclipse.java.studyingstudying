import java.util.Locale;
import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int x, y;
	double a, b;
	x = sc.nextInt();
	y = sc.nextInt();
	a = sc.nextDouble();
	b = y * a;
	
	System.out.println("NUMBER = " + x);
	System.out.printf("SALARY = U$ %.2f%n", b);
	
	sc.close();
}