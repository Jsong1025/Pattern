package startegy;

public class OldDiscount implements DiscountStrategy {

	@Override
	public double getDiscount(double originPrice) {
		System.out.println("ʹ�þ����ۿ�...");
		return originPrice * 0.7;
	}

}
