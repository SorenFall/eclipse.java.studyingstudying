import java.util.Locale;
import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt(), y = sc.nextInt();
	int f;
			
	if (x < y)
		f = y - x;
	else 
		f = 24 - x + y;
	System.out.println("O JOGO DUROU " + f + " HORA(S)");
			
	sc.close();
}
