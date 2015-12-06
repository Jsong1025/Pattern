package factory;

public class OutputFactory {
	
	public Output getPrinterOutput(String type){
		if (type.equalsIgnoreCase("better")) {
			return new BetterPrinter();
		} else {
			return new Printer();
		}
	}

}
