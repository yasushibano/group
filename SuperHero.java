public class SuperHero extends Hero{
	private boolean flying;
	public boolean isFlying() {
		return flying;
	}
	public void setFlying(boolean flying) {
		this.flying = flying;
	}
	
	
	public void flying() {
		this.flying =true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {
		System.out.println(this.getName() + "は撤退した！");
	}
}
