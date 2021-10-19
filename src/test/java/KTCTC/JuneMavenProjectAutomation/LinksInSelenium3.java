package KTCTC.JuneMavenProjectAutomation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LinksInSelenium3 {
	
	String actualURL = null;
	@Test
	public void getAllLinksOnPage()
	{
		SoftAssert sAssert = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://demoqa.com/links");
		
		List<WebElement> allTags = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links on page = "+ allTags.size());
		
		for (WebElement each:allTags)
		{
			actualURL = each.getAttribute("href");
			
			if(!(each.getAttribute("href")==null) && each.getAttribute("href").contains("javascript:"))
					{
				actualURL = "https://demoqa.com/"+each.getAttribute("id");  
				        
					}
			
			
			int status = getLinkStatus(actualURL);
			
			if (status>=400)
			{
				System.out.println("Below URL is Brocken ");
				System.out.println(actualURL);
				sAssert.assertTrue(false);
				
			}
			else
			{
				System.out.println("Below URL is working fine...");
				System.out.println(actualURL);
				sAssert.assertTrue(true);
			}
			
			
		}
		sAssert.assertAll();

		
	}
	
	public static int getLinkStatus(String urll)
	{
		int dd=500;
		try {
			URL url = new URL(urll);
			
			HttpsURLConnection http = (HttpsURLConnection)url.openConnection();
			
			http.setConnectTimeout(15000);
			
			http.connect();
			
			dd = http.getResponseCode();
			
			System.out.println(dd);
			
			System.out.println(http.getResponseMessage());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return dd;
		
	}

}
