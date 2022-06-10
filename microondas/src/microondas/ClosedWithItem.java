package microondas;

public class ClosedWithItem extends Estado {

	Microwave m;

	public ClosedWithItem(Microwave microwave) {
		m = microwave;

		m.doorOpen = false;
		m.withItem = true;
		m.cooking = false;

		m.lamp.lamp_off();
		m.turnable.turnable_stop();
		m.heating.heating_off();
	}

	protected void door_open() {
		m.setEstado(new OpenWithItem(m));
	}

	protected void door_closed() {
		throw new RuntimeException();
	}

	protected void item_placed() {
		throw new RuntimeException();
	}

	protected void item_removed() {
		throw new RuntimeException();
	}

	protected void cooking_stop() {
		throw new RuntimeException();
	}

	protected void cooking_start() {
		if (m.timer > 0 && m.power > 0)
			m.setEstado(new Cooking(m));
		else
			throw new RuntimeException();
	}
}
