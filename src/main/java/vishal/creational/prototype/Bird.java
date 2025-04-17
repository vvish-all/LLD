package vishal.creational.prototype;

public class Bird implements cloneable<Bird>{
	
	private String name;
	private double weight;
	private String color;
	
	public Bird() {}
	
	public Bird(Bird oldBird) {
		this.color = oldBird.getColor();
		this.name = oldBird.getName();
		this.weight = oldBird.getWeight();
	}

	@Override
	public Bird clone() {
		return new Bird(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
