package seleniumInterviewQuestions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hitURLByJavascriptExecutor {
	public void navigateToURL() {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.cricbuzz.com";
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.location=\'"+url+"\'");
	}
	public static void main(String[] args) {
		hitURLByJavascriptExecutor hitURL = new hitURLByJavascriptExecutor();
		hitURL.navigateToURL();
	}
}