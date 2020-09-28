import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the interest calculator!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			// prompt for 2 inputs:  loanAmt, intRate
			System.out.print("Loan Amount?  ");
			//double loanAmt = sc.nextDouble();
			BigDecimal loanAmtBD = sc.nextBigDecimal();
			System.out.print("Interest Rate?  ");
			//double intRate = sc.nextDouble();
			BigDecimal intRateBD = sc.nextBigDecimal();
			
			
			// do biz logic:
			// 1) calculate intAmt
			BigDecimal intAmt = loanAmtBD.multiply(intRateBD)
					.setScale(2, RoundingMode.HALF_UP);
			// 2) create 2 NumberFormats - currency, percent
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);

			// display results
			System.out.println();
			System.out.println("Loan Amount:\t"+currency.format(loanAmtBD));
			System.out.println("Interest Rate:\t"+percent.format(intRateBD));
			System.out.println("Interest:\t"+currency.format(intAmt));
			System.out.println();
			
			System.out.print("Continue(y/n)?  ");
			choice = sc.next();
		}
		
		
		
		sc.close();
		System.out.println("Bye");

	}

}
