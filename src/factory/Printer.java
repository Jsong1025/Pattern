package factory;

public class Printer implements Output {
	
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
			System.out.println("打印机打印："+printData[0]);
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

}
