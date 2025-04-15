package vishal.creational.builder;

public class XUVBuilder implements CarBuilder{
	
	Car car = new Car();

	@Override
	public CarBuilder carTypeBuilder(CarType carType, int seats, String color) {
		car.setCarType(CarType.XUV);
		car.setSeats(seats);
		car.setColor(color);
		return this;
		
	}

	@Override
	public CarBuilder carEngineBuilder(int stroke, GearType gearType) {
		car.setStroke(stroke);
		car.setGearType(gearType);
		return this;
	}

	@Override
	public Car build() {		
		return car;
	}



}
