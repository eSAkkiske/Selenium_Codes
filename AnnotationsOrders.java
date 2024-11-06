package TestNGLearing;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class AnnotationsOrders {
	WebDriver driver;
	Long startTime;
	Long endTime;
	Long TotalTime;
  @Test
  public void test1()
  {
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("Esakkiappan");
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("esakki1103@gmail.com");
		WebElement Phone = driver.findElement(By.id("phone"));
		Phone.sendKeys("9003887171");
		WebElement Address = driver.findElement(By.id("textarea"));
		Address.sendKeys("S-3 Jerusha Residency\nBajanai koil 2nd lane\nChoolaimedu\nChennai-600094");
		System.out.println("Test-1 method executed successfully");
  }
  @Test
  public void test2() 
  {
	  WebElement Country = driver.findElement(By.id("country"));
	  Select selectCountry = new Select(Country);
	  selectCountry.selectByValue("india");
	  System.out.println("Test-2 method executed successfully");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
		WebElement Double = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		Actions DoubleActions = new Actions(driver);
		DoubleActions.doubleClick(Double).build().perform();
		System.out.println("Beforemethod executed successfully");
  }
  @AfterMethod
  public void afterMethod() 
  {
	  WebElement bookTable = driver.findElement(By.xpath("//table[@name='BookTable']"));
	  List<WebElement> rowCount = bookTable.findElements(By.xpath("//div[@id='HTML1']//following::table[@name='BookTable']//tr"));
	  System.out.println("Total No.of.Rows : "+rowCount.size());
	  List<WebElement> columnCount = bookTable.findElements(By.xpath("//div[@id='HTML1']//following::table[@name='BookTable']//td"));
	  System.out.println("Total No.of.Columns : "+columnCount.size());
	  WebElement Selenium = bookTable.findElement(By.xpath("//div[@id='HTML1']//following::table[@name='BookTable']//tr[2]"));
	  System.out.println("Selected Row Values are : "+Selenium.getText());
	  WebElement Book = bookTable.findElement(By.xpath("//td[normalize-space(text())='Master In Selenium']"));
	  System.out.println("Book name is : "+Book.getText());
	  WebElement Author = bookTable.findElement(By.xpath("//td[normalize-space(text())='Master In Selenium']//following::td[1]"));
	  System.out.println("Author name is : "+Author.getText());
	  WebElement Subject = bookTable.findElement(By.xpath("//td[normalize-space(text())='Master In Selenium']//following::td[2]"));
	  System.out.println("Subject name is : "+Subject.getText());
	  WebElement Price = bookTable.findElement(By.xpath("//td[normalize-space(text())='Master In Selenium']//following::td[3]"));
	  System.out.println("Price amount is : "+Price.getText());
	  System.out.println("Aftermethod executed successfully");
  }
  @BeforeClass
  public void beforeClass() 
  {
	  WebElement Gender = driver.findElement(By.xpath("//input[@id='male']"));
	  Gender.click();
	  System.out.println("Beforeclass method executed successfully");
  }
  @AfterClass
  public void afterClass() 
  {
		WebElement Date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		Date.click();
		WebElement Next = driver.findElement(By.xpath("//a[@title='Next']"));
		Next.click();
		WebElement selectDate = driver.findElement(By.xpath("//a[normalize-space(text())='21']"));
		selectDate.click();
		System.out.println("Afterclass method executed successfully");
  }
  @BeforeTest
  public void beforeTest() 
  {
		WebElement CB1 = driver.findElement(By.xpath("//input[@id='sunday']"));
		CB1.click();
		WebElement CB2 = driver.findElement(By.xpath("//input[@id='monday']"));
		CB2.click();
		WebElement CB3 = driver.findElement(By.xpath("//input[@id='saturday']"));
		CB3.click();
		System.out.println("Beforetest method executed successfully");
  }
  @AfterTest
  public void afterTest() 
  {
		List<WebElement> selectable = driver.findElements(By.xpath("//select[@id='colors']//option"));
		Actions colorsAction = new Actions(driver);
		colorsAction.keyDown(Keys.CONTROL).click(selectable.get(0)).build().perform();
		colorsAction.keyDown(Keys.CONTROL).click(selectable.get(2)).build().perform();
		colorsAction.keyDown(Keys.CONTROL).click(selectable.get(4)).build().perform();
		System.out.println("Aftertest method executed successfully");
  }
  @BeforeSuite
  public void beforeSuite()
  {
		startTime = System.currentTimeMillis();
		System.setProperty("webDriver.chrome.driver", 
				"C:\\Users\\User\\OneDrive-Cloutics Pvt Ltd\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Beforesuite method executed successfully");
  }
  @AfterSuite
  public void afterSuite()
  {
	  driver.quit();
	  endTime = System.currentTimeMillis();
	  TotalTime = endTime - startTime;
	  System.out.println("Total time to execute the test cases is : "+TotalTime);
	  System.out.println("Aftersuite method executed successfully");
  }
}