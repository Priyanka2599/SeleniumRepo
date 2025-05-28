package week3.day2;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Browser 
{

	public static void main(String[] args) 
	{
		
		String s ="Hi";
		System.out.println(s);
		
		List<Integer> list = new LinkedList();
		
		System.out.println(list);
		
		
		/*ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/index.htm");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		System.out.println(title);
		
		//driver.findElements(B
		
		
		WebElement elementDD = driver.findElement(By.id("collapseOne"));
		Select select = new Select(elementDD);
		driver.selectByValue("accordion-collapse collapse"); 
		
		
		//input[@name='fullname']
		
		/*
		driver.findElement(By.id("email")).sendKeys("touser");
		driver.findElement(By.name("password")).sendKeys("touser");
		driver.findElement(By.partialLinkText("Login")).click();
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		driver.findElement(By.id("form-check-input")).click();
		driver.findElement(By.xpath("//input[@name='fullname']")); 
		*/
	}

}
