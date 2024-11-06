package seleniumInterviewQuestions;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class takeScreenShotRobotClass
{
	public void screenShotRobotClass() throws AWTException, IOException 
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement simpleAlert = driver.findElement(By.id("j_idt88:j_idt91"));
		simpleAlert.click();
		//screenShot taken by Robot framework
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectObj = new Rectangle(screenSize);
		BufferedImage sourceFile = robot.createScreenCapture(rectObj);
		File fileObject = new File("C:\\Users\\User\\OneDrive - Cloutics Pvt Ltd\\Desktop\\Varsheetha\\RobotScreenShot.png");
		ImageIO.write(sourceFile, "png", fileObject);
	}
	public static void main(String[] args) throws AWTException, IOException 
	{
		takeScreenShotRobotClass screenShot = new takeScreenShotRobotClass();
		screenShot.screenShotRobotClass();
	}
}