package util;

public class CurrencyConverter {
public static final double DOLLAR = 3.71;
public static double MonyValor(double value) {
	double totalComprado = value * DOLLAR;
    double valorImposto = totalComprado * 0.06;
 
    return totalComprado + valorImposto;

	
}

}
