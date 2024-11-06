package seleniumInterviewQuestions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class printSuggestionsValue 
{
	public void getSuggestionsValues() 
	{
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchValue = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchValue.sendKeys("Admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@id='Alh6id']//li"));
		int suggestionSize = suggestion.size();
		for(int i=0;i<suggestionSize;i++) 
		{
			String suggestionsResults = suggestion.get(i).getText();
			System.out.println(suggestionsResults);
		}
	}
	public static void main(String[] args) 
	{
		printSuggestionsValue suggestionsValue = new printSuggestionsValue();
		suggestionsValue.getSuggestionsValues();
	}
}