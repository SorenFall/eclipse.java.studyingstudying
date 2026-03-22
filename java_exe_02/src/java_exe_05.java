import java.util.Locale;
import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt(), y = sc.nextInt();
	double p;
			
	if (x == 1) {
		p = 4 * y;
		System.out.printf("Total: R$ %.2f%n", p);
		}
	else if (x == 2) {
		p = 4.5 * y;
		System.out.printf("Total: R$ %.2f%n", p);
		}
	else if (x == 3) {
		p = 5 * y;
		System.out.printf("Total: R$ %.2f%n", p);
		}
	else if (x == 4) {
		p = 2 * y;
		System.out.printf("Total: R$ %.2f%n", p);
		}
	else if (x == 5) {
		p = 1.5 * y;
		System.out.printf("Total: R$ %.2f%n", p);
		}
	else {
		System.out.println("Codigo Invalido");
		}
			
	sc.close();
}
