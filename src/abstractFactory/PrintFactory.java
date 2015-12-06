package abstractFactory;

public class PrintFactory implements OutputFactory {

	@Override
	public Output getOutput() {
		return new Printer();
	}

}
