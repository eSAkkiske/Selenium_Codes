package seleniumInterviewQuestions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class refreshABrowser 
{
	public void getCurrentUrlRefresh() throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement simpleAlert = driver.findElement(By.id("j_idt88:j_idt91"));
		simpleAlert.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	//getCurrentUrl method used to refresh the current browser.
		driver.get(driver.getCurrentUrl());
	}
	public void usingRefreshMethod() throws InterruptedException, AWTException
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/alert.xhtml");
		WebElement simpleAlert = driver.findElement(By.id("j_idt88:j_idt91"));
		simpleAlert.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
//		refresh method used to refresh the browser.
			 driver.navigate().refresh(); 
//		Refresh a browser by using javascript executor by 2-ways location.reload() & history.go(0).
			 JavascriptExecutor executor = (JavascriptExecutor) driver;
			 executor.executeScript("history.go(0)");
			 executor.executeScript("location.reload()", "");
//		Refresh a browser by robot framework using the f5 key.
			 Robot robot = new Robot();
			 robot.keyPress(KeyEvent.VK_F5);
			 robot.keyRelease(KeyEvent.VK_F5);
	}
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		refreshABrowser browserRefresh = new refreshABrowser();
		browserRefresh.getCurrentUrlRefresh();
//		browserRefresh.usingRefreshMethod();
	}
}