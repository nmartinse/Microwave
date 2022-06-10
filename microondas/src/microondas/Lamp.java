package microondas;

public class Lamp {
	private boolean lampOn; //privado porque el resto de metodos sirven como get y set
	
	public void lamp_on() {
		lampOn = true;
	}
	
	public void lamp_off() {
		lampOn = false;
	}
	
	public boolean isLampOn() {
		return lampOn;
	}
}
