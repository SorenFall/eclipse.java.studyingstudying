import java.util.Locale;
import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	double x, y, z;
			
	for (int c=0; c<N; c++) {
		double r = 0;
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		r = (x * 2 + y * 3 + z * 5) / 10;
		System.out.printf("%.1f%n", r);
	}
	sc.close();
}
