package facade;

public class Facade {
	
	Payment pay;
	Cook cook;
	Waiter waiter;
	
	public Facade() {
		this.pay = new PaymentImlp();
		this.cook = new CookImpl();
		this.waiter = new WaiterImpl();
	}
	
	public void saveFood(){
		String food = pay.pay();
		food = cook.cook(food);
		waiter.saver(food);
	}
	
	public static void main(String[] args) {
		Facade f = new Facade();
		f.saveFood();
	}

}
