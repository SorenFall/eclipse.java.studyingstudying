import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double x, y, z;
	x = sc.nextDouble();
	y = 3.14159;
	z = y * x * x;
	
	System.out.printf("A=%.4f", z);
	
	sc.close();
}