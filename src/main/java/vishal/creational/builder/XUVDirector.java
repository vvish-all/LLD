package vishal.creational.builder;

public class XUVDirector {
	
	private XUVBuilder xuvBuilder;

	public XUVDirector(XUVBuilder xuvBuilder) {
		this.xuvBuilder = xuvBuilder;
	}
	
	
	public Car XUVConstructor() {
		return xuvBuilder.carTypeBuilder(CarType.XUV, 4, "Black")
				.carEngineBuilder(6, GearType.AUTOMATIC)
				.build();
		
	}
	

}
