package microondas;

public class Turnable {
	
	private boolean turnableOn;
	
	public void turnable_start() {
		turnableOn = true;
	}

	public void turnable_stop() {
		turnableOn = false;
	}
	
	public boolean isMoving() {
		return turnableOn;
	}
}
