package vishal.creational.builder;

public class Car {
	
	private CarType carType;
	private int seats;
	private String color;
	
	//engine
	private int stroke;
	private GearType gearType;
	
	
	public CarType getCarType() {
		return carType;
	}
	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getStroke() {
		return stroke;
	}
	public void setStroke(int stroke) {
		this.stroke = stroke;
	}
	public GearType getGearType() {
		return gearType;
	}
	public void setGearType(GearType gearType) {
		this.gearType = gearType;
	}
	

	
	

}
