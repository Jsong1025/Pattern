package abstractFactory;

public class Computer {

	private Output out;

	public Computer(Output out) {
		this.out = out;
	}
	
	public void keyln(String msg){
		out.getDate(msg);
	}
	
	public void print() {
		out.out();
	}
	
	public static void main(String[] args) {
		OutputFactory factory =  OutputFactoryFactory.getOutputFactory("normal");
		Computer computer = new Computer(factory.getOutput());
		computer.keyln("hello world");
		computer.print();
		
		factory =  OutputFactoryFactory.getOutputFactory("better");
		computer = new Computer(factory.getOutput());
		computer.keyln("hello world");
		computer.print();
		
		
	}

}
