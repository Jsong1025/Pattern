package bridge;

public class PorkyNoodle extends AbstarctNoodle {
	
	public PorkyNoodle(Peppery style) {
		super(style);
	}

	@Override
	public void eat() {
		System.out.println("����һ���������������������"+super.style.style());
	}
	
	

}
