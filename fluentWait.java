package seleniumInterviewQuestions;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWait 
{
	public void learningFluentWait() 
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
		
		//fluentWait -> Tell the webDriver to wait for a given condition & given frequency that want to check the condition before throws an exception.
		//frequency -> reduces the burden of a default polling.
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).
				withTimeout(Duration.ofSeconds(10)).
				pollingEvery(Duration.ofSeconds(3)).
				ignoring(NoSuchElementException.class);
		
		WebElement userProfile = fluentWait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement profileLink  = driver.findElement(By.xpath("//ul[@class='sidebar-menu list-items w-100 g-1 user_menu']//li[3]"));
				return profileLink;
			}
		});
		userProfile.click();
	}
	public static void main(String[] args) 
	{
		fluentWait fluentWait = new fluentWait();
		fluentWait.learningFluentWait();
	}
}