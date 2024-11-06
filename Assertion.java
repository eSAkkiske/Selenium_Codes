package TestNGLearing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Assertion 
{
	@Test
	public void stringAssertion()
	{
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\User\\OneDrive - "
				+ "Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		
		WebElement alertSimple = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
		alertSimple.click();
		org.openqa.selenium.Alert simpleAlert = driver.switchTo().alert();
		String simpleAlertHeader = simpleAlert.getText();
		System.out.println("Simple alert heading is : "+simpleAlertHeader);
		simpleAlert.accept();
		WebElement simplealertMessage = driver.findElement(By.xpath("//span[@id='simple_result']"));
		String simpleMessage = simplealertMessage.getText();
		System.out.println("Simple alert message is : "+simpleMessage);
		System.out.println();
		String message = "You have successfully clicked an alert";
		Assert.assertEquals(simpleMessage, message);
	}
	@Test
	public void booleanAssertion()
	{
		System.setProperty("webDriver.chrome.driver", 
				"C:\\Users\\User\\OneDrive-Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement Gender = driver.findElement(By.xpath("//input[@id='male']"));
		Gender.click();	
		Boolean selected = Gender.isSelected();
		selected=true;
		Assert.assertTrue(selected);
	}
}
