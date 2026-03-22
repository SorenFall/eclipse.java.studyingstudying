import java.util.Locale;
import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	double x = 0, y = 0, z = 0;
			
	for (int a=0; a<N; a++) {
		x = sc.nextDouble();
		y = sc.nextDouble();
		if (y != 0) {
			z = x / y;
			System.out.println(z);
		}
		else {
			System.out.println("divisao impossivel");
		}
	}
	sc.close();
}
