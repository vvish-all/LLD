package vishal.creational.builder;

public interface CarBuilder {
	CarBuilder carTypeBuilder(CarType carType, int Seats, String Color);
	CarBuilder carEngineBuilder(int Stroke, GearType gearType);
	Car build();
	
}
