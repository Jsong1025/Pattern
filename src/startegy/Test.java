package startegy;

public class Test {
	
	public static void main(String[] args) {
		DiscountContext dc = new DiscountContext(null);
		double price1 = 79;
		System.out.println("79Ԫ����Ĭ�ϴ��ۺ�ļ۸��ǣ�"+dc.getDiscountPrice(price1));
		
		dc.setDiscount(new VipDiscount());
		double price2 = 89;
		System.out.println("89Ԫ����Ĭ�ϴ��ۺ�ļ۸��ǣ�"+dc.getDiscountPrice(price2));
	}

}
