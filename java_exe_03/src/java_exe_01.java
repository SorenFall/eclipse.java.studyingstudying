import java.util.Locale;
import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt();
			
	while (x != 2002) {
		System.out.println("Senha Invalida");
		x = sc.nextInt();
	}
	System.out.println("Acesso Permitido");
			
	sc.close();
}
