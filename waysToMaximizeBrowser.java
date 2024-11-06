package seleniumInterviewQuestions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class waysToMaximizeBrowser 
{
	public void maximizeBrowser() 
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
	//Use chromeOptions to maximize the browser by default and pass the chromeOptions to a chromeDriver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");	
		WebDriver driver =  new ChromeDriver(options);
		driver.get("https://www.leafground.com/alert.xhtml");
	//maximize a browser by below 
		driver.manage().window().maximize();		
	//Dimension class to maximize the browser.
		Dimension dimension = new Dimension(1366, 768);
		driver.manage().window().setSize(dimension);
	}
	public static void main(String[] args) 
	{
		waysToMaximizeBrowser browserMax = new waysToMaximizeBrowser();
		browserMax.maximizeBrowser();
	}
}