package bridge;

public class Test {
	
	public static void main(String[] args) {
		AbstarctNoodle noodle1 = new BeefNoodle(new PepperyStyle());
		noodle1.eat();
		AbstarctNoodle noodle2 = new BeefNoodle(new PlainStyle());
		noodle2.eat();
		AbstarctNoodle noodle3 = new PorkyNoodle(new PepperyStyle());
		noodle3.eat();
		AbstarctNoodle noodle4 = new PorkyNoodle(new PlainStyle());
		noodle4.eat();
	}

}
