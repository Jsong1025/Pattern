package observer;

public class PriceObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof Double) {
			System.out.println("�۸�۲���"+o+"��Ʒ�۸��Ѿ��ı�Ϊ:"+arg);
		}
	}

}
