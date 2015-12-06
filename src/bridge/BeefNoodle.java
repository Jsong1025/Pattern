package bridge;

public class BeefNoodle extends AbstarctNoodle {

	public BeefNoodle(Peppery style) {
		super(style);
	}

	@Override
	public void eat() {
		System.out.println("这是一碗美味的牛肉面条。"+super.style.style());
	}

	
	
}
