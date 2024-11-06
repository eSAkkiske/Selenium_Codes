package seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {
	public void browserLaunchWithoutSystemProperty() {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/login");
		WebElement eMailId = driver.findElement(By.id("email"));
		eMailId.sendKeys("user@phptravels.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("demouser");
		WebElement loginButton = driver.findElement(By.id("submitBTN"));
		loginButton.click();
	}
	public static void main(String[] args) {
		launchBrowser browser = new launchBrowser();
		browser.browserLaunchWithoutSystemProperty();
	}
}