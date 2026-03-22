import java.util.Locale;
import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt();
	int a = 0, g = 0, d = 0;
			
	while (x != 4) {
		if (x == 1 )
			a += 1;
		else if (x == 2)
			g += 1;
		else if (x == 3)
			d += 1;
		x = sc.nextInt();
	}
	System.out.println("MUITO OBRIGADO");
	System.out.println("Alcool: " + a);
	System.out.println("Gasolina: " + g);
	System.out.println("Diesel: " + d);
			
	sc.close();
}
