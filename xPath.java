package xPathLearning;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class xPath 
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
		driver.get("http://eofficeqa.cloutics.net");
	}
	@Test()
	public void xPathOne() throws InterruptedException
	{
		//find an element with Known Attributes
		WebElement loginId = driver.findElement(By.xpath("//*[@name='LoginIdTextField']"));
		loginId.sendKeys("Sridhar");
		System.out.println(loginId.getText());
		
		//find an element with known element & known attributes
		WebElement authenticate = driver.findElement(By.xpath("//button[@id='AuthenticateButton']"));
		authenticate.click();
		
		//find an element with known visible text
		WebElement visbileText = driver.findElement(By.xpath("//h1[text()='كلمه السر']"));
		String message = visbileText.getAttribute("data-translate");
		System.out.println(message);
		
		//find an element with part of text by using the visible text
		WebElement partialText = driver.findElement(By.xpath("//h1[contains(text(),'كلمه')]"));
		String partialMessage = partialText.getAttribute("data-translate");
		System.out.println(partialMessage);
		
		//find an element by using the multiple attributes
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		WebElement password = driver.findElement(By.xpath("//input[@id='PasswordSecureField'][@tabindex='2']"));
		password.sendKeys("Admin123");
		
		//find an element by using starting text of the visible text
		WebElement startingVisibleText = driver.findElement(By.xpath("//span[starts-with(text(),'ادخل')]"));
		String startingPartialMessage = startingVisibleText.getAttribute("alt");
		System.out.println(startingPartialMessage);
		
		//find an element with dynamic attributes -> Contains & Starts-with
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@id,'Login')]"));
		loginButton.click();
		loginButton.click();
	}
	@AfterSuite
	public void closeBrowser()
	{
		endTime = System.currentTimeMillis();
		TotalTime = endTime - startTime;
		System.out.println("Total time to execute the test cases is : "+TotalTime);
	}
}