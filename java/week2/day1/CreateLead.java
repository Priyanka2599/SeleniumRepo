package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//get title
		System.out.println(driver.getTitle());
		//enter username and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");	
		
		//click on the submit
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click CRM/SFA login
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Navigate to Leads tab
		driver.findElement(By.linkText("Leads")).click();
		// click on Create Leads button
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Enter a FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyanka");
		// Enter a LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pappaiya");
		// Enter a Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tata Elxsi");
		// Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SeleniumAPR Batch");

		// Click on create Lead button
		driver.findElement(By.name("submitButton")).click();
		// title verification
		String title1 = driver.getTitle();
		System.out.println(title1);

		// Close the browser window
		driver.close();

		
	}

}
