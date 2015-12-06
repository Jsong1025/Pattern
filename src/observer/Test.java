package observer;

public class Test {
	
	public static void main(String[] args) {
		Product p = new Product("���ӻ�",176);
		
		NameObserver no = new NameObserver();
		PriceObserver po = new PriceObserver();
		
		p.registObserver(po);
		p.registObserver(no);
		
		p.setName("����");
		p.setPrice(345f);
		
	}

}
