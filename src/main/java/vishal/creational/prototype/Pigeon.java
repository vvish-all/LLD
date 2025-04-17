package vishal.creational.prototype;

public class Pigeon extends Bird {
	
	private String sound;
	
	public Pigeon() {}
	
	
	public Pigeon(Pigeon pigeon) {
		super(pigeon);
		this.sound = pigeon.getSound();
	}

	@Override
	public Pigeon clone() {
		return new Pigeon(this);
	}
	
	public String getSound() {
		return sound;
	}


	public void setSound(String sound) {
		this.sound = sound;
	}
	
	

	
	

}
