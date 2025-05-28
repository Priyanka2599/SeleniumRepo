package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//click Submit
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click CRM/SFA login
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on Accounts
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter details
		driver.findElement(By.id("accountName")).sendKeys("Priyanka");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("7");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//Click Create Account to submit
		driver.findElement(By.className("smallSubmit")).click();
		
		//close the browser
		driver.close();
	}

}
