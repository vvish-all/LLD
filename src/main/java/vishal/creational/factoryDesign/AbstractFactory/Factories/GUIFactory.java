package vishal.creational.factoryDesign.AbstractFactory.Factories;

import vishal.creational.factoryDesign.AbstractFactory.Buttons.Button;
import vishal.creational.factoryDesign.AbstractFactory.CheckBoxes.CheckBox;

public interface GUIFactory {
	
	Button createButton();
	CheckBox createCheckBox();
	

}
