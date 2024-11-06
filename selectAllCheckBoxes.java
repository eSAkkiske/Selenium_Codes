package seleniumInterviewQuestions;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class selectAllCheckBoxes {
	public void checkBoxSelect() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver =  new ChromeDriver(options);
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for (WebElement checkBox : allCheckBoxes) {
//			checkBox.click();
//		}
		for(int i =0;i<allCheckBoxes.size();i++) {
			allCheckBoxes.get(i).click();
		}
	}
	public static void main(String[] args) {
		selectAllCheckBoxes allCheckBoxes = new selectAllCheckBoxes();
		allCheckBoxes.checkBoxSelect();
	}
}