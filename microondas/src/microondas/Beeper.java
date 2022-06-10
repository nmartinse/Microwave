package microondas;

public class Beeper{
	
	
	public void beep (int d) {
		while(d >= 0) {
			avisa();
		}
	}

	private String avisa() {
		return "*";
		
	}
}
