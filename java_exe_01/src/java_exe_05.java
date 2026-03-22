import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int c1, c2, q1, q2;
	double p1, p2, pt;
	c1 = sc.nextInt();
	q1 = sc.nextInt();
	p1 = sc.nextDouble();
	
	c2 = sc.nextInt();
	q2 = sc.nextInt();
	p2 = sc.nextDouble();
	
	pt = p1 * q1 + p2 * q2;
	
	System.out.printf("VALOR A PAGAR: R$ %.2f", pt);
	
	sc.close();
}
