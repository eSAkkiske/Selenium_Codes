package seleniumInterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explictWait 
{
	public void learningExplictWait() 
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/login");
		WebElement eMailId = driver.findElement(By.id("email"));
		eMailId.sendKeys("user@phptravels.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("demouser");
		WebElement loginButton = driver.findElement(By.id("submitBTN"));
		loginButton.click();
		
		//explictWait -> allows to command the webDriver to wait for a given conditions are completed.
		
		WebDriverWait explictWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement profileLink = explictWait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//ul[@class='sidebar-menu list-items w-100 g-1 user_menu']//li[3]")));
		profileLink.click();
	}
	public static void main(String[] args) 
	{
		explictWait Expwait = new explictWait();
		Expwait.learningExplictWait();
	}
}