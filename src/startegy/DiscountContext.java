package startegy;

public class DiscountContext {
	
	private DiscountStrategy strategy;

	public DiscountContext(DiscountStrategy strategy) {
		this.strategy = strategy;
	}
	
	public double getDiscountPrice(double price){
		if (strategy == null) {
			strategy = new OldDiscount();
		}
		return strategy.getDiscount(price);
	}
	
	public void setDiscount(DiscountStrategy strategy){
		this.strategy = strategy;
	}

}
