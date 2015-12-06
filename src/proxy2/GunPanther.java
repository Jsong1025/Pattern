package proxy2;

public class GunPanther implements Panther {

	@Override
	public void info() {
		System.out.println("我是一只猎豹");
	}

	@Override
	public void run() {
		System.out.println("我迅速奔跑");
	}

}
