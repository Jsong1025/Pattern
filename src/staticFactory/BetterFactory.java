package staticFactory;

public class BetterFactory implements OutputFactory{

	@Override
	public Output getOutput() {
		return new BetterPrinter();
	}

}
