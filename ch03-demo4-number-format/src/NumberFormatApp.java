import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
		// p. 105
		double astonMartinPrice = 245789.23;
		double interestPct = .034457;
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat pct = NumberFormat.getPercentInstance();
		pct.setMaximumFractionDigits(2);
		
		System.out.println("Car finance info:");
		System.out.println("Price:\t\t"+currency.format(astonMartinPrice));
		System.out.println("Interest:\t"+pct.format(interestPct));

	}

}
