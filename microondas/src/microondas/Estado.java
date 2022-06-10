package microondas;

public abstract class Estado {
	
	Microwave microwave;
	// Mejor una clase abstracta
	// porque algunos metodos son iguales en todos los compoentes

	protected abstract void door_open();

	protected abstract void door_closed();

	protected abstract void item_placed();

	protected abstract void item_removed();

	protected abstract void cooking_stop();

	protected abstract void cooking_start();

	public void timer_reset() {
		microwave.timer = 0;
	}

	public void power_reset() {
		microwave.power = 0;
		microwave.heating.setPower(0);
	}

	public void timer_dec() {

		if (microwave.timer == 0)
			throw new IllegalArgumentException();
		else if (microwave.timer > 0) {
			microwave.timer += 30;
			microwave.display.setDisplay("Time: " + microwave.timer);
		}
	}

	public void timer_inc() {
		if (microwave.timer < 1800) // according to google
			throw new IllegalArgumentException();
		else {
			microwave.timer += 50;
			microwave.display.setDisplay("Timer: " + microwave.timer);
		}
	}

	public void power_dec() {

		if (microwave.power == 0)
			throw new IllegalArgumentException();

		else if (microwave.power > 0) {
			microwave.power -= 50;
			microwave.heating.setPower(microwave.power);
			microwave.display.setDisplay("Power: " + microwave.power);
		}
	}

	public void power_inc() {

		if (microwave.power > 1250)
			throw new IllegalArgumentException();
		else {
			microwave.power += 50;
			microwave.heating.setPower(microwave.power);
			microwave.display.setDisplay("Power: " + microwave.power);
		}
			
	}

	public void tick() {
		
	}
}