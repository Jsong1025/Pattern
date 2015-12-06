package proxy2;

public class Test {

	public static void main(String[] args) throws Exception {
		Panther target = new GunPanther();
		Panther panther = (Panther) MyProxyFactory.getProxy(target);
		panther.info();
		panther.run();
	}	

}
