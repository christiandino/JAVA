package entities;

public class ConvertMoeda {
	
	public static final double TAX = 0.06;
	
	public static double CurrencyConverter(double price, double dollars) {
		return ((price * dollars) * TAX) + price * dollars;
	}
	
}
