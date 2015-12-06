package abstractFactory;

public class BetterPrinter implements Output {
	
	private String[] printData = new String[MAX_CACHE_LINE];
	private int dataNum = 0;

	@Override
	public void getDate(String msg) {
		if (dataNum >= MAX_CACHE_LINE) {
			System.out.println("输出队列已满，添加失败");
		} else {
			printData[dataNum++] = msg;
		}
	}

	@Override
	public void out() {
		while (dataNum > 0) {
			System.out.println("高速打印机正在打印"+printData[0]);
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
		
	}

}
