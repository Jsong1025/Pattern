package startegy;

public class VipDiscount implements DiscountStrategy {

	@Override
	public double getDiscount(double originPrice) {
		System.out.println(" π”√VIP’€ø€...");
		return originPrice * 0.5;
	}

}
