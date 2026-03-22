package entities;

public class note {
	public String name, msg;
	public Double n1, n2, n3, N, F;
	
	public String result() {
		N = n1 + n2 + n3;
		if (N >= 60) {
			msg = String.format("FINAL GRANDE = %.2f%nPASS", N);
		}
		else{
			F = 60 - N;
			msg = String.format("FINAL GRANDE = %.2f%nFAILED%nMISSING %.2f POINTS", N, F);
		}
		return msg;
	}
}
