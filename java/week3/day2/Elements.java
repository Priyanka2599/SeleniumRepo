package week3.day2;

import java.awt.TextField;

//create Elements subclass and inherit the Button subclass
public class Elements extends Button
{

	public static void main(String[] args)
	{
		
		//Create objects for all subclasses
		Button button =new Button();
		TextField textfield = new TextField();
		CheckBoxButton checkboxbutton = new CheckBoxButton();
		RadioButton radiobutton = new RadioButton();
		Elements elements=new Elements();
		
		//calling methods from Button subclass
		button.click();
		button.setText("Button inhereted from WebElement superclass");
		button.submit();
		
		//calling methods from TextField subclass
		textfield.click();
		textfield.setText("TextField inhereted from WebElement superclass");
		textfield.getText();
		
		//calling methods from CheckBoxButton subclass
		checkboxbutton.click();
		checkboxbutton.clickCheckButton();
		checkboxbutton.setText("CheckBoxButton inhereted from WebElement superclass");
		checkboxbutton.submit();
		
		//Calling methods from RadioButton subclass
		radiobutton.click();
		radiobutton.selectRadioButton();
		radiobutton.setText("RadioButton inhereted from WebElement superclass");
		radiobutton.submit();
		
		//Calling methods from Elements subclass
		elements.click();
		elements.setText("Elements inhereted from WebElement superclass");
		elements.submit();
		

	}

}

