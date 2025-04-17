package vishal.creational.factoryDesign.AbstractFactory.App;

import vishal.creational.factoryDesign.AbstractFactory.Factories.GUIFactory;
import vishal.creational.factoryDesign.AbstractFactory.Factories.MacFactory;
import vishal.creational.factoryDesign.AbstractFactory.Factories.WinFactory;
import vishal.creational.factoryDesign.AbstractFactory.Platform.Platform;

public class App {
	
	private Platform platform;
	
	private App() {}
	
	public App (Platform platform) {		
		this.platform = platform;		
	}
	
	public GUIFactory createFactory() {
		
		return switch(platform) {
			case Windows -> new WinFactory();
			case Mac -> new MacFactory();
		};
		
	}
	

}
