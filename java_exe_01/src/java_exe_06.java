import java.util.Locale;
import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double A, B, C, pi = 3.14159;
	double TRI, CIR, TRA, QUA, RET; 
	A = sc.nextDouble();
	B = sc.nextDouble();
	C = sc.nextDouble();
	
	TRI = A * C / 2;
	CIR = pi * C *C;
	TRA = (A + B) * C / 2;
	QUA = B * B;
	RET = A * B;
	
	System.out.printf("TRIANGULO: %.3f%n", TRI);
	System.out.printf("CIRCULO: %.3f%n", CIR);
	System.out.printf("TRAPEZIO: %.3f%n", TRA);
	System.out.printf("QUADRADO: %.3f%n", QUA);
	System.out.printf("RETANGULO: %.3f%n", RET);
	
	sc.close();
}
