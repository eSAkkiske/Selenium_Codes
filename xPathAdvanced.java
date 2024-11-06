package xPathLearning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class xPathAdvanced 
{
	WebDriver driver; Long startTime; Long endTime; Long TotalTime;
	@BeforeSuite
	public void startBrowser()
	{
		System.setProperty("webDriver.chrome.driver", 
				"C:\\Users\\User\\OneDrive-Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		startTime = System.currentTimeMillis();
		driver.get("https://testautomationpractice.blogspot.com");
	}
	@Test()
	public void xPathTwo() 
	{
		//finding an parent element
		//syntax : elementName[@attribute='Value']//parent::elementName
		//Example : //input[@id='email']//parent::div"
		driver.findElement(By.xpath("//input[@id='email']//parent::div"));
		
		
		//finding an child element
		//syntax : elementName[@attribute='Value']//child::elementName
		//Example : //div[@class='form-group']//child::input[2]
		WebElement eMail = driver.findElement(By.xpath("//div[@class='form-group']//child::input[2]"));
		eMail.sendKeys("eSAkki1103@gmail.com");
		
		//finding an ancestor element
			//syntax : elementName[@attribute='Value']//ancestor::elementName
			//example : //input[@id='male']//ancestor::div[1]
		driver.findElement(By.xpath("//input[@id='male']//ancestor::div[1]"));
		
		//finding an following element following -> after elements are finded from the current element & last() -> get the last element.
			//syntax : elementName[@attribute='Value']//following::elementName
			//example : //input[@id='name']//following::input[2]
		WebElement phone = driver.findElement(By.xpath("//input[@id='name']//following::input[2]"));
		phone.sendKeys("9003886161");
		
		//finding an preceding element preceding -> before elements are finded from the current element & last() -> get the last element.
			//syntax : elementName[@attribute='Value']//preceding::elementName
			//example : //input[@id='phone']//preceding::input[last()]
		WebElement name = driver.findElement(By.xpath("//input[@id='phone']//preceding::input[last()]"));
		name.sendKeys("Esakkiappan");
		
		//finding an following-sibling element
			//syntax : elementName[@attribute='Value']//following-sibling::elementName
			//example : //div[@class='form-group'][2]//following-sibling::textarea
		WebElement address = driver.findElement(By.xpath("//div[@class='form-group'][2]//following-sibling::textarea"));
		address.sendKeys("Choolaimedu\nchennai\n600094");
		
		//finding an preceding-sibling element
			//syntax : elementName[@attribute='Value']//preceding-sibling::elementName
			//example : //label[@for='male']//preceding-sibling::input
		WebElement male = driver.findElement(By.xpath("//label[@for='male']//preceding-sibling::input"));
		male.click();
	}
	@AfterSuite
	public void closeBrowser()
	{
		endTime = System.currentTimeMillis();
		TotalTime = endTime - startTime;
		System.out.println("Total time to execute the test cases is : "+TotalTime);
	}
}
