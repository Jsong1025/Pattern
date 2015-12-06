package startegy;

public class Test {
	
	public static void main(String[] args) {
		DiscountContext dc = new DiscountContext(null);
		double price1 = 79;
		System.out.println("79元的书默认打折后的价格是："+dc.getDiscountPrice(price1));
		
		dc.setDiscount(new VipDiscount());
		double price2 = 89;
		System.out.println("89元的书默认打折后的价格是："+dc.getDiscountPrice(price2));
	}

}
