package startegy;

public class VipDiscount implements DiscountStrategy {

	@Override
	public double getDiscount(double originPrice) {
		System.out.println("ʹ��VIP�ۿ�...");
		return originPrice * 0.5;
	}

}
