package vishal.creational.factoryDesign.simpleFactory.factory;

import vishal.creational.factoryDesign.simpleFactory.Product;
import vishal.creational.factoryDesign.simpleFactory.ProductA;

public class FactoryA implements ProductFactory{

	@Override
	public Product createProduct() {
		return new ProductA();
	}

}
