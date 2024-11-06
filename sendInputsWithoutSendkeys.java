package seleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendInputsWithoutSendkeys {
	public void sendInputsJavascriptExecutoe() {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		WebElement userName = driver.findElement(By.name("j_idt88:name"));
	//send a inputs by using javaScript executor by identifed webElement
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].value='Esakkiappan'", userName);
	//send a inputs using javaScript executor by finding webElement
		executor.executeScript("document.getElementsByName('j_idt88:j_idt91')[0].value=' Tamilnadu'", "");
	}
	public void sendInputRobotClass() throws AWTException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		WebElement textBoxName = driver.findElement(By.name("name"));
		textBoxName.click();
	//send a inputs by robotClass.
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
	}
	public static void main(String[] args) throws AWTException {
		sendInputsWithoutSendkeys withoutSendkeys = new sendInputsWithoutSendkeys();
		withoutSendkeys.sendInputsJavascriptExecutoe();
		withoutSendkeys.sendInputRobotClass();
	}
}