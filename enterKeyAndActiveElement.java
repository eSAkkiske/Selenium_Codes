package seleniumInterviewQuestions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class enterKeyAndActiveElement {
	static WebElement qb;
	@Test(priority = 0)
	public void pressEnterKey() throws AWTException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		WebElement nameValue = driver.findElement(By.id("names11"));
//		//Press a enter key by using keys.ENTER concept.
			nameValue.sendKeys("Admin",Keys.ENTER);
//		//press a enter key by using \n concept.
			nameValue.sendKeys("Admin \n");
//		//press a enter key by using submit() method.
			nameValue.sendKeys("Automation Testing");
			nameValue.submit();
//		//press a enter key by using Robot framework.
			nameValue.sendKeys("Automation Testing");
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);		
	}
	@Test(priority = 1)
	public void activeElement() {	
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		PageFactory.initElements(driver,enterKeyAndActiveElement.class );
		driver.switchTo().activeElement().sendKeys("Admin");
		qb.sendKeys("Admin \n");
	}
}