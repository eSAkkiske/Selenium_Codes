package seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class diffGetAndNavigate 
{
	public void learningGet() 
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
	}
	public void learningNavigate() throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://phptravels.net/login");
		WebElement eMailId = driver.findElement(By.id("email"));
		eMailId.sendKeys("user@phptravels.com");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("demouser");
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		diffGetAndNavigate getAndNavigate = new diffGetAndNavigate();
//		getAndNavigate.learningGet();
		getAndNavigate.learningNavigate();
	}
}
