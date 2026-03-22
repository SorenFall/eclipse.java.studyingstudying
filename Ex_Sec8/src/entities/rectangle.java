package entities;

public class rectangle {
	public double x, y;
	
	public double area() {
		return x * y;
	}
	public double peri() {
		return 2*(x+y);
	}
	public double diag() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
}
