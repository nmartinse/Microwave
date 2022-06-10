package microondas;

public class OpenWithNoItem extends Estado {

	Microwave m;
	
	public OpenWithNoItem(Microwave microwave) {
		m = microwave;
		
		m.doorOpen = true;
		m.withItem = false;
		m.cooking = false;
		
		m.lamp.lamp_on();	
		m.heating.heating_off();
		m.turnable.turnable_stop();
	}

	public void door_open() {
		throw new RuntimeException();
	}

	public void door_closed() {
		m.setEstado(new ClosedWithNoItem(m));
	}

	public void item_placed() {
		m.setEstado(new OpenWithItem(m));
	}

	public void item_removed() {
		throw new RuntimeException();
	}

	public void cooking_start() {
		throw new RuntimeException();
	}

	public void cooking_stop() {
		throw new RuntimeException();
	}
}
