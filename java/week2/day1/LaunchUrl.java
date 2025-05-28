package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrl {

	public static void main(String[] args)
	{
		
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		 
		//load URL
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the browser window.
		driver.manage().window().maximize();
		
		//get title
		System.out.println(driver.getTitle());
		
		//username
		driver.findElement(By.id("email")).sendKeys("testleaf.2003@gmail.com\"");
		//password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//login
		driver.findElement(By.name("login")).click();
		
		// Closing the browser
		driver.close();
		
		
		
		
		
	}

}
