void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int A, B, C, D, x;
	A = sc.nextInt();
	B = sc.nextInt();
	C = sc.nextInt();
	D = sc.nextInt();
	x = A * B - C * D;
	
	System.out.println("DIFERENCA = " + x);
	
	sc.close();
}