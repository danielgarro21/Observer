package observer;

public class PesoMXObserver extends Observer {
	
	private double exchangeValue = 19.07;
	
	public PesoMXObserver(Subject sujeto) {
		this.fellow = sujeto;
		this.fellow.agregar(this);
	}
	
	@Override
	public void update() {		
		System.out.println("MX: " + (fellow.getState() * exchangeValue));
	}


}
