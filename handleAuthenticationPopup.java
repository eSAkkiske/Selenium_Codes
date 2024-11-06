package seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handleAuthenticationPopup {
	public void handlePopup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver =  new ChromeDriver(options);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		WebElement loginSuccess = driver.findElement(By.xpath("//div[@class='example']//p"));
		System.out.println(loginSuccess.getText());
	}
	public static void main(String[] args) {
		handleAuthenticationPopup authPopup = new handleAuthenticationPopup();
		authPopup.handlePopup();
	}
}