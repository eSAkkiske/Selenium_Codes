package seleniumInterviewQuestions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class elementUnderLinedOrNot {
	public void underLinedOrNot() {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		WebElement pantUpdate = driver.findElement(By.xpath("//a[@class='big-crd-rltd-txt'][contains(text(),'like Pant')]"));
		String beforeHover = pantUpdate.getCssValue("text-decoration");
		System.out.println(beforeHover);
		Actions actions = new Actions(driver);
		actions.moveToElement(pantUpdate).build().perform();
		String afterHover = pantUpdate.getCssValue("text-decoration");
		System.out.println(afterHover);
	}
	public static void main(String[] args) {
		elementUnderLinedOrNot linedOrNotLined = new elementUnderLinedOrNot();
		linedOrNotLined.underLinedOrNot();
	}
}