package factory;

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
		OutputFactory factory = new OutputFactory();
		Computer computer = new Computer(factory.getPrinterOutput("normal"));
		computer.keyln("hello world");
		computer.print();
		
		computer = new Computer(factory.getPrinterOutput("better"));
		computer.keyln("hello world");
		computer.print();
		
	}

}
