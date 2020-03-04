

import observer.EuroObserver;
import observer.PesoARGObserver;
import observer.PesoMXObserver;
import observer.Subject;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new EuroObserver(subject);
		new PesoARGObserver(subject);
		new PesoMXObserver(subject);
		
		System.out.println("Si desea cambiar 10 dolares obtendra : ");
		subject.setState(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 dolares obtendra : ");
		subject.setState(100);
	}
}
