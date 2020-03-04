package observer;

import java.util.ArrayList;
import java.util.List;


public class Subject {

	private final List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(final int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void agregar(final Observer observador) {
		observers.add(observador);
	}

	public void notifyAllObservers() {
		observers.forEach(x -> x.update());
	}

}
