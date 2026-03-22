import java.util.Locale;
import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt();
			
	for (int i=1; i<=x; i++) {
		System.out.println(i);
		i++;
	}
				
	sc.close();
}
