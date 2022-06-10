package microondas;

public class Microwave {
	
	protected Estado estado;
	protected boolean doorOpen, cooking, withItem;
	protected int power, timer;
	
	protected Lamp lamp;
	protected Heating heating;
	protected Display display;
	protected Turnable turnable;
	protected Beeper beep;
	
	public Microwave() {
		power = 0;
		timer = 0;
		display.clearDisplay();
		heating.setPower(power);
		estado = new ClosedWithNoItem(this);
	}
	protected void setEstado (Estado e) {
		estado = e;
	}
	
	public Estado getEstado()
	{
		return estado;
	}
	public void door_open()
	{
		estado.door_open();
	}
	
	public void door_closed() {
		estado.door_closed();
	}
	
	public void item_placed() {
		estado.item_placed();
	}
	
	public void item_removed() {
		estado.item_removed();
	}
	
	public void power_inc() {
		estado.power_inc();
	}
	
	public void power_dec() {
		estado.power_dec();
	}
	
	public void power_reset() {
		estado.power_reset();
	}
	
	public void timer_inc() {
		estado.timer_inc();
	}
	
	public void timer_dec() {
		estado.timer_dec();
	}
	
	public void timer_reset() {
		estado.timer_reset();
	}
	
	public void cooking_star() {
		estado.cooking_start();
	}
	
	public void cooking_stop() {
		estado.cooking_stop();
	}
	
	public void tick() {
		estado.tick();
	}
 }


