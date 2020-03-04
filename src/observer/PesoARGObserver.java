package observer;

public class PesoARGObserver extends Observer {

	private final double exchangeValue = 29.86;

	public PesoARGObserver(final Subject fellow) {
		this.fellow = fellow;
		this.fellow.agregar(this);
	}
	
	@Override
	public void update() {		
		System.out.println("ARG: " + (fellow.getState() * exchangeValue));
	}
}
