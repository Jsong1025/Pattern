package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Observable {
	
	List<Observer> observers = new ArrayList<Observer>();
	
	public void registObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		observers.add(o);
	}
	
	public void notifyObservers(Object value) {
		for (Iterator it = observers.iterator();it.hasNext();) {
			Observer o = (Observer) it.next();
			o.update(this,value);
		}
	}
	
}
