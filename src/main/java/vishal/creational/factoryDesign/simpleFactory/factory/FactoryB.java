package vishal.creational.factoryDesign.simpleFactory.factory;

import vishal.creational.factoryDesign.simpleFactory.Product;
import vishal.creational.factoryDesign.simpleFactory.ProductB;

public class FactoryB implements ProductFactory{

	@Override
	public Product createProduct() {
		return new ProductB();
	}
	
	

}
