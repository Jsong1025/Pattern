package bridge;

public class PorkyNoodle extends AbstarctNoodle {
	
	public PorkyNoodle(Peppery style) {
		super(style);
	}

	@Override
	public void eat() {
		System.out.println("这是一碗稍嫌油腻的猪肉面条。"+super.style.style());
	}
	
	

}
