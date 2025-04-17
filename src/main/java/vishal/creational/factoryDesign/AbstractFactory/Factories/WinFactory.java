package vishal.creational.factoryDesign.AbstractFactory.Factories;

import vishal.creational.factoryDesign.AbstractFactory.Buttons.Button;
import vishal.creational.factoryDesign.AbstractFactory.Buttons.WindowsButton;
import vishal.creational.factoryDesign.AbstractFactory.CheckBoxes.CheckBox;
import vishal.creational.factoryDesign.AbstractFactory.CheckBoxes.WindowsCheckBox;

public class WinFactory implements GUIFactory{

	@Override
	public Button createButton() {
		
		return new WindowsButton();
	}

	@Override
	public CheckBox createCheckBox() {
		
		return new WindowsCheckBox();
	}
	
	

}
