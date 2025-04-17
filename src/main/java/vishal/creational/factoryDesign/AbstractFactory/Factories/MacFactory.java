package vishal.creational.factoryDesign.AbstractFactory.Factories;

import vishal.creational.factoryDesign.AbstractFactory.Buttons.Button;
import vishal.creational.factoryDesign.AbstractFactory.Buttons.MacButton;
import vishal.creational.factoryDesign.AbstractFactory.CheckBoxes.CheckBox;
import vishal.creational.factoryDesign.AbstractFactory.CheckBoxes.MacCheckBox;

public class MacFactory implements GUIFactory{

	@Override
	public Button createButton() {
		
		return new MacButton();
	}

	@Override
	public CheckBox createCheckBox() {
		
		return new MacCheckBox();
	}

}
