package microondas;

public class Heating {
	
	private boolean heating;
	private int power;
	
	public void heating_on() {
		heating = true;
	}
	
	public void heating_off() {
		heating = false;
	}
	
	public void setPower(int p) {
		power = 0;
	}
	
	public boolean isHeating() {
		return heating;
	}
	
	public int getPower() {
		return power;
	}
}
