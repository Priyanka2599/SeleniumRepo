package week3.day2;


//create Button subclass which inherits superclass WebElement -- simple inheritance
public class Button extends WebElement
{
	//create method inside the subclass
	public void submit()
	{
		System.out.println("Submit --> from Button subclass");
	}

}

