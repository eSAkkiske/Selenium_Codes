package seleniumInterviewQuestions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickaSuggestionValues 
{
	public void positionSuggestionClick() 
	{
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchValue = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchValue.sendKeys("Admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@id='Alh6id']//li"));
		int suggestionPosition = 0;
		for (WebElement valuesList : suggestion) 
		{
			System.out.println(valuesList.getText());
			suggestionPosition++;
			if(suggestionPosition==7) 
			{
				valuesList.click();
				break;
			}
		}
		driver.quit();
	}
	public void valueSuggestionClick() 
	{
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchValue = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchValue.sendKeys("Admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@id='Alh6id']//li"));
		for (WebElement valuesList : suggestion) 
		{
			String suggestionValue = valuesList.getText();
			System.out.println(suggestionValue);
			if(suggestionValue.contains("chennai")) 
			{
				valuesList.click();
				break;
			}
		}
		driver.quit();
	}
	public static void main(String[] args) 
	{
		clickaSuggestionValues suggestionValues = new clickaSuggestionValues();
		suggestionValues.positionSuggestionClick();
		suggestionValues.valueSuggestionClick();
	}
}