package vishal.creational.factoryDesign.AbstractFactory;

import vishal.creational.factoryDesign.AbstractFactory.App.App;
import vishal.creational.factoryDesign.AbstractFactory.Factories.GUIFactory;
import vishal.creational.factoryDesign.AbstractFactory.Platform.Platform;

public class Client {
	public static void main(String[] args) {
		
		App app = new App(Platform.Windows);
		
		GUIFactory factory =  app.createFactory();
		
		factory.createButton().paint();;
		factory.createCheckBox().paint();;
		
		System.out.println("I am here");
		
	}
}
