package vishal.creational.factoryDesign.simpleFactory;

public class ProductA implements Product{
	
	private String name;
	
	@Override
	public void display() {
		System.out.println("This is Product A");
		
	}

}
