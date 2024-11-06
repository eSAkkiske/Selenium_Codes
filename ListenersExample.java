package TestNGLearing;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class ListenersExample 
{
	WebDriver driver;
	Long startTime;
	Long endTime;
	Long TotalTime;
	@BeforeSuite
	public void StartBrowser() 
	{
		startTime = System.currentTimeMillis();
		System.setProperty("webDriver.chrome.driver", 
				"C:\\Users\\User\\OneDrive-Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	@Test(dependsOnMethods = "Alert")
	public void TextBox()
	{
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("Esakkiappan");
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("esakki1103@gmail.com");
		WebElement Phone = driver.findElement(By.id("phone"));
		Phone.sendKeys("9003887171");
		WebElement Address = driver.findElement(By.id("textarea"));
		Address.sendKeys("S-3 Jerusha Residency\nBajanai koil 2nd lane\nChoolaimedu\nChennai-600094");
	}
	@Test(dependsOnMethods = "Alert")
	public void DropDown() 
	{
		WebElement Country = driver.findElement(By.id("country"));
		Select selectCountry = new Select(Country);
		selectCountry.selectByValue("india");
	}
	@Test(dependsOnMethods = "Alert")
	public void DoubleClick() 
	{
		WebElement Double = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		Actions DoubleActions = new Actions(driver);
		DoubleActions.doubleClick(Double).build().perform();
	}
	
	@Test()
	public void Alert()
	{
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']"));
		simpleAlert.click();
		Alert alertSimple = driver.switchTo().alert();
		System.out.println("Simple alert message is : " +alertSimple.getText());
		alertSimple.accept();
	}
	@AfterSuite
	public void closeBrowser()
	{
//		driver.quit();
		endTime = System.currentTimeMillis();
		TotalTime = endTime - startTime;
		System.out.println("Total time to execute the test cases is : "+TotalTime);
	}
}
