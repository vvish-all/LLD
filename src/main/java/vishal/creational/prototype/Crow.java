package vishal.creational.prototype;

public class Crow extends Bird{
	
	private String sound;
	private String leg;
	
	public Crow() {}

	public Crow(Crow crow) {
		super(crow);
		this.sound = crow.getSound();
		this.leg = crow.getLeg();
		
	}
	
	@Override
	public Crow clone() {
		return new Crow(this);
	}
	
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getLeg() {
		return leg;
	}

	public void setLeg(String leg) {
		this.leg = leg;
	}
	
	

}
