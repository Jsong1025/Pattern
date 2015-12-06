package startegy;

public class OldDiscount implements DiscountStrategy {

	@Override
	public double getDiscount(double originPrice) {
		System.out.println(" π”√æ… È’€ø€...");
		return originPrice * 0.7;
	}

}
