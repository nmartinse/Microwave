package microondas;

public class Cooking extends Estado {
	
	Microwave m;
	
	public Cooking(Microwave microwave) {
		m = microwave;
		
		m.cooking = true;
		m.doorOpen = false;
		m.withItem = true;
		
		m.lamp.lamp_on();
		m.heating.heating_on();
		m.turnable.turnable_start();
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
		m.setEstado(new ClosedWithItem(m));
	}

	protected void cooking_start() {
		throw new RuntimeException();
	}
	
	public void power_dec() {

		if (m.power == 0) {
			m.setEstado(new ClosedWithItem(m));
		}
			

		else if (m.power > 0) {
			m.power -= 5;
			m.display.setDisplay("Power: " + m.power);
		}
	}
	
	public void timer_dec() {

		if (m.timer == 0)
			m.setEstado(new ClosedWithItem(m));
		else if (m.timer > 0) {
			m.timer += 30;
			m.display.setDisplay("Timer: " + m.timer);
		}
	}
	
	public void tick() {
		while (m.power > 0 && m.timer > 0) {
			m.timer--;
		}
		m.beep.beep(3);
		m.setEstado(new ClosedWithItem(m));
	}
 }
