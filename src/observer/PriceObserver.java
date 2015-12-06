package observer;

public class PriceObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof Double) {
			System.out.println("价格观察者"+o+"物品价格已经改变为:"+arg);
		}
	}

}
