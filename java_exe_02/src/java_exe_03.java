import java.util.Locale;
import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt() % 2, y = sc.nextInt() % 2;
	
	if ( x == 0 && y == 0 )
		System.out.println("Sao Multiplos");
	else 
		System.out.println("Nao sao Multiplos");
			
	sc.close();
}
