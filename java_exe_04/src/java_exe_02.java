import java.util.Locale;
import java.util.Scanner;

void main( ) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt(), in = 0, out =0;
			
	for (int X=0; X<N; X++) {
		int I = sc.nextInt();
		if (I >= 10 && I <=20)
			in++;
		else
			out++;
	}
		System.out.println(in + " in");
		System.out.println(out + " out");
	sc.close();
}
