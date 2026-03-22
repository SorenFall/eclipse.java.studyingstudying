import java.util.Locale;
import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt();
	
	if ( x % 2 == 0 )
		System.out.println("PAR");
	else 
		System.out.println("IMPAR");
			
	sc.close();
}
