package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemonstratingSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		//Initialize ChromeDrive
		ChromeDriver driver = new ChromeDriver();
		//max the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get("https://en-gb.facebook.com/");	
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		Thread.sleep(5000);
		
		//Click on the Create new account button.
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		//Enter the First name and lastname
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dorry");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Morry");
		
		//Enter the Mobile number or email address.
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9753124680");
		
		//Enter the New password.
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("facebook@2025");
		
		//Handle all three dropdowns in Date of birth
		
		//Create select object for day Drop down
		WebElement dayDD = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select selectDay = new Select(dayDD);
		selectDay.selectByValue("25");
		
		//Create select object for Month Drop Down
		WebElement monthDD = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select selectMonth = new Select(monthDD);
		selectMonth.selectByIndex(6);
		
		//Create select object for year Drop Down
		WebElement yearDD = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select selectYear = new Select(yearDD);
		selectYear.selectByContainsVisibleText("2003");
		
		//Select the radio button in Gender.
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
