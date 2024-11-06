package seleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollWePage 
{
	public void scrollUpAndScrollDown() throws InterruptedException 
	{
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		
		//scroll_Up and scroll_Down a webPage by javaScriptExecutor
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("window.scrollBy(0,750)", ""); //for scrollDown a webPage to a particular height.
			Thread.sleep(2000);
			executor.executeScript("window.scroll(0,-750)", ""); //for scrollUp a webPage to a particular height.
			Thread.sleep(2000);
			executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", ""); //for scrollDown to a bottom of the webPage.
			Thread.sleep(2000);
			executor.executeScript("window.scrollTo(0,0)", ""); //for scrollUp to a top of the webPage.
			Thread.sleep(2000);
		//scroll to a particular position where required element is present
			WebElement selectSRHNews = driver.findElement(By.xpath("//a[contains(text(),'SRH onboard')]"));
			executor.executeScript("arguments[0].scrollIntoView(true);", selectSRHNews);
			Thread.sleep(2000);
			selectSRHNews.click();
	}
	public void scrollUpAndDown_robotClass() throws AWTException, InterruptedException 
	{
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		
		//scrollUpandDown a webPage by robotClass.
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_DOWN); 
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);	
	}
	public static void main(String[] args) throws InterruptedException, AWTException{
		scrollWePage webPageScroll = new scrollWePage();
//		webPageScroll.scrollUpAndScrollDown();
		webPageScroll.scrollUpAndDown_robotClass();
	}
}