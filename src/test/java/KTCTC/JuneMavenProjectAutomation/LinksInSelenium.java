package KTCTC.JuneMavenProjectAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksInSelenium {
	@Test
	public void getAllLinksOnPage()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://demoqa.com/links");
		
		List<WebElement> allTags = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links on page = "+ allTags.size());
		
		for (WebElement each:allTags)
		{
			System.out.println(each.getAttribute("href"));
			
			if(!(each.getAttribute("href")==null) && each.getAttribute("href").contains("javascript:"))
					{
				        String data = "https://demoqa.com/"+each.getAttribute("id");  
				        System.out.println(data);
					}
			
			
		}

		
	}

}
