package week3.day2;

//create subclass LoginTestData
public class LoginTestData extends TestData 
{
	// create 2 methods inside LoginTestData subclass
	public void enterUsername()
	{
		System.out.println("EnterUsername --> subclass");
	}
	public void enterPassword()
	{
		System.out.println("Enterpassword --> subclass");
	}

	public static void main(String[] args) 
	{
		//Create object for the superclass inside the subclass 
		TestData testdata = new TestData();
		
		//call the methods of the superclass using the objects
		testdata.enterCredentials();
		testdata.navigateToHomePage();
		
		//Create object for the subclass 
		LoginTestData ltd = new LoginTestData();
		
		//call the methods of the subclass which extends the superclass methods also
		System.out.println("Methods inside the subclass");
		ltd.enterCredentials();
		ltd.navigateToHomePage(); 
		ltd.enterUsername();
		ltd.enterPassword();
		

	}

}

