package abstractFactory;

public class OutputFactoryFactory {
	
	public static OutputFactory getOutputFactory(String type){
		if (type.equalsIgnoreCase("better")) {
			return new BetterFactory();
		} else {
			return new PrintFactory();
		}
	}

}
