package observer;

public class EuroObserver extends Observer {

	private double exchangeValue = 0.90;
	
	public EuroObserver(Subject fellow) {
		this.fellow = fellow;
		this.fellow.agregar(this);
	}
	
	@Override
	public void update() {		
		System.out.println("EUR: " + (fellow.getState() * exchangeValue));
	}

}
