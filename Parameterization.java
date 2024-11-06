package TestNGLearing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Parameterization 
{
	WebDriver driver;
	@BeforeSuite
	public void startBrowser()
	{
		System.setProperty("webDriver.chrome.driver", 
				"C:\\Users\\User\\OneDrive-Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	@Test
	@Parameters({"userName","eMail","phone","address"})
	public void textBox(String user_Name, String user_eMail, String user_phone, String user_address)
	{
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys(user_Name);
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys(user_eMail);
		WebElement Phone = driver.findElement(By.id("phone"));
		Phone.sendKeys(user_phone);
		WebElement Address = driver.findElement(By.id("textarea"));
		Address.sendKeys(user_address);
	}
}
