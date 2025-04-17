package vishal.creational.factoryDesign.simpleFactory;

import vishal.creational.factoryDesign.simpleFactory.factory.FactoryA;
import vishal.creational.factoryDesign.simpleFactory.factory.FactoryB;
import vishal.creational.factoryDesign.simpleFactory.factory.ProductFactory;

public class Client {
	
	public static void main(String[] args) {
		
		ProductFactory factoryA = new FactoryA();
		ProductFactory factoryB = new FactoryB();
		
		factoryA.createProduct().display();
		
		factoryB.createProduct().display();
		
		System.out.println("I am here ");
		
	}

}
