package seleniumInterviewQuestions;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class takeScreenShotFileHandler 
{
	public void takingScreenShot() throws IOException 
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/login");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C:\\Users\\User\\OneDrive - Cloutics Pvt Ltd\\Desktop\\Varsheetha\\FileHandlerSS.png");
		FileHandler.copy(sourceFile, destinationFile);
	}
	public static void main(String[] args) throws IOException 
	{
		takeScreenShotFileHandler fileHandler = new takeScreenShotFileHandler();
		fileHandler.takingScreenShot();
	}
}