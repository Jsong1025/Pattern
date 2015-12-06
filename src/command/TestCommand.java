package command;

public class TestCommand {
	
	public static void main(String[] args) {
		ProcessArray ps = new ProcessArray();
		int[] target = {3,-4,6,4};
		ps.each(target, new Command() {
			
			@Override
			public void process(int[] target) {
				for (int t: target) {
					System.out.println("�������Ŀ������:"+t);
				}
			}
		});
		System.out.println("-----------------------------");
		
		ps.each(target, new Command() {
			
			@Override
			public void process(int[] target) {
				int sum = 0;
				for (int t : target) {
					sum += t;
				}
				System.out.println("�����ܺ��ǣ�"+sum);
			}
		});
	}

}
