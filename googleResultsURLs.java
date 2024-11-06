package seleniumInterviewQuestions;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleResultsURLs {
	public void getURLs() {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement googleSearch = driver.findElement(By.id("APjFqb"));
		googleSearch.sendKeys("12th fail \n");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Fetch the main links from browser
		List<WebElement> totalLinks = driver.findElements(By.xpath("//div[@id='search']//a[@jsname='UWckNb']//cite"));
		for (WebElement webElement : totalLinks) {
			String mainLinks = webElement.getText();
			System.out.println(mainLinks);
		}
		
		//Fetch all the links in the browser
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		for (WebElement webElement : allLinks) {
			String links = webElement.getAttribute("href");
			System.out.println(links);
		}
	}
	public static void main(String[] args) {
		googleResultsURLs resultsURLs = new googleResultsURLs();
		resultsURLs.getURLs();
	}
}