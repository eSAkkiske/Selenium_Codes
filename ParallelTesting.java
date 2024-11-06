package TestNGLearing;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class ParallelTesting 
{
	WebDriver driver;
	@Test
	public void Calender() 
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		
		WebElement FromDate = driver.findElement(By.id("datetimepicker1"));
		FromDate.click();
		
		WebElement Month = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/select"));
		Month.click();
		Select selectMonth = new Select(Month);
		selectMonth.selectByVisibleText("November");
		
		WebElement selectDate = driver.findElement(By.xpath("//span[@aria-label='November 30, 2024']"));
		selectDate.click();
		
		WebElement Hour = driver.findElement(By.xpath("//input[@class='numInput flatpickr-hour']"));
		Hour.clear();
		Hour.sendKeys("03");
		
		WebElement Minutes = driver.findElement(By.xpath("//input[@class='numInput flatpickr-minute']"));
		Minutes.clear();
		Minutes.sendKeys("45");
		
		WebElement Button = driver.findElement(By.xpath("//span[@class='flatpickr-am-pm']"));
		Button.click();
		driver.quit();
	}
	@Test
	public void DoubleClick() 
	{
		System.setProperty("webDriver.chrome.driver", 
				"C:\\Users\\User\\OneDrive-Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement Double = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		Actions DoubleActions = new Actions(driver);
		DoubleActions.doubleClick(Double).build().perform();
		driver.quit();
	}
	@Test
	public void AutoCompletion() throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/auto-complete.php");
		WebElement tags = driver.findElement(By.id("tags"));
		tags.sendKeys("A");
		Thread.sleep(3000);
		List <WebElement> options  = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		for (WebElement webElement : options) 
		{
			if(webElement.getText().equals("JavaScript")) {
				webElement.click();
				System.out.println("Selected option is : " + tags.getAttribute("value"));
				break;
			}
		}
		driver.quit();
	}
}
