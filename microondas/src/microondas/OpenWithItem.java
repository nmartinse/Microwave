package microondas;

public class OpenWithItem extends Estado {
	
	Microwave m;

	public OpenWithItem(Microwave microwave) {
		m = microwave;
		
		m.doorOpen = true;
		m.withItem = true;
		m.cooking = false;
		
		m.lamp.lamp_on();
		m.turnable.turnable_stop();
		m.heating.heating_off();
	}

	protected void door_open() {
		throw new RuntimeException();
	}

	protected void door_closed() {
		m.setEstado(new ClosedWithItem(m));
	}

	protected void item_placed() {
		throw new RuntimeException();
	}

	protected void item_removed() {
		m.setEstado(new OpenWithNoItem(m));
	}

	protected void cooking_stop() {
		throw new RuntimeException();
	}

	protected void cooking_start() {
		throw new RuntimeException();
	}

}
