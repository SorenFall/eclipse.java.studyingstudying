package entities;

public class salary {
	public String name;
	public Double salary, tax, percentage;
	
	public double liquido() {
		return salary - tax;
		
	}
	public double newLiquido() {
		return salary + (salary * (percentage / 100)) - tax;
	}
}
