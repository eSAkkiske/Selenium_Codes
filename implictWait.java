package seleniumInterviewQuestions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class implictWait
{
	public void learningImplictWait() 
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/login");
		WebElement eMailId = driver.findElement(By.id("email"));
		eMailId.sendKeys("user@phptravels.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("demouser");
		WebElement loginButton = driver.findElement(By.id("submitBTN"));
		loginButton.click();
		WebElement profileLink = driver.findElement(By.xpath("//ul[@class='sidebar-menu list-items w-100 g-1 user_menu']//li[3]"));
		profileLink.click();
	}
	public static void main(String[] args) 
	{
		implictWait  I_wait = new implictWait();
		I_wait.learningImplictWait();
	}
}