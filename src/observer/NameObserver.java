package observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NameObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof String) {
			String name = (String) arg;
			JFrame f = new JFrame("�۲���");
			JLabel l = new JLabel("���Ƹı�Ϊ"+name);
			f.add(l);
			f.pack();
			f.setVisible(true);
			System.out.println("���ƹ۲���"+o+"��Ʒ���Ƹı�Ϊ:"+name);
		}
	}

}
