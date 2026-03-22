package ultil;

public class CurrencyConverter {
	public static final double IOF = 6;
	public static double dolarPrice, quantity, realPrice, realTotal, realDisc;
	
	public static double realPrice() {
		realPrice = (dolarPrice * quantity) * (IOF / 100);
		return realPrice;
	}
}
