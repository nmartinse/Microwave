package microondas;

public class ClosedWithNoItem extends Estado{
	
	Microwave m;

	public ClosedWithNoItem(Microwave microwave) {
		m = microwave;
		
		m.doorOpen = false;
		m.withItem = false;
		m.cooking = false;
		
		m.heating.heating_off();
		m.lamp.lamp_off();
		m.turnable.turnable_stop();
		
	}

	public void door_open() {
		m.setEstado(new OpenWithNoItem(m));
	}

	public void door_closed() {
		throw new RuntimeException();
	}

	public void item_placed() {
		throw new RuntimeException();
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
