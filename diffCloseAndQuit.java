package seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class diffCloseAndQuit
{
	public void closeMethod() throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		WebElement closeDiff = driver.findElement(By.id("j_idt88:new"));
		closeDiff.click();
		Thread.sleep(2000);
//		driver.close();  //close() -> close the browser window that the webDriver has focus on it.
		driver.quit();   //quit() -> close all the browser window and sessions that are associated with webDriver.
	}
	public static void main(String[] args) throws InterruptedException 
	{
		diffCloseAndQuit closeAndQuit = new diffCloseAndQuit();
		closeAndQuit.closeMethod();
	}
}