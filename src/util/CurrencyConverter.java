package util;

public class CurrencyConverter {

	public static final double IOF = 1.06;
	// Como o valor da porcentagem de IOF já estava definido para 6%, fazer a
	// multiplicação por 1.06 é equivalente em aumentar o valor em 6%

	public static double convert(double dollarPrice, double amount) {
		return amount * dollarPrice * IOF;
	}

}
