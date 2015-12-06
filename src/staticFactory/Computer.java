package staticFactory;

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
		OutputFactory factory =  new BetterFactory();
		Computer computer = new Computer(factory.getOutput());
		computer.keyln("hello world");
		computer.print();
		
		factory = new PrintFactory();
		computer = new Computer(factory.getOutput());
		computer.keyln("hello world");
		computer.print();
		
		
	}

}
