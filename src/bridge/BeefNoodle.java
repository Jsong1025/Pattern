package bridge;

public class BeefNoodle extends AbstarctNoodle {

	public BeefNoodle(Peppery style) {
		super(style);
	}

	@Override
	public void eat() {
		System.out.println("����һ����ζ��ţ��������"+super.style.style());
	}

	
	
}
