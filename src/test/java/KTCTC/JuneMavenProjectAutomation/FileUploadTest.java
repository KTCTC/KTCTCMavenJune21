package KTCTC.JuneMavenProjectAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FileUploadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");	
		
		
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
	    driver.navigate().to("http://demo.guru99.com/test/upload/");
	    
	    driver.findElement(By.id("uploadfile_0")).sendKeys(System.getProperty("user.dir")+"\\AB.properties");
	    
	    driver.findElement(By.id("terms")).click();
	    driver.findElement(By.id("submitbutton")).click();
	    
	    WebDriverWait wt = new WebDriverWait(driver, 10);
	    
	    wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='res']//center"))));
	    
	    String data = driver.findElement(By.xpath("//*[@id='res']//center")).getText().replace("\n", " ");
	    
	    if (data.equals("1 file has been successfully uploaded."))
	    {
	    	System.out.println("Verify user can upload file test case is Passed");
	    }
	    else
	    {
	    	System.out.println("Verify user can upload file test case is Failled");
	    }
	    
	  String str1 = driver.findElement(By.xpath("//*[@id='res']//center")).getAttribute("innerText");
	    String str2 = driver.findElement(By.xpath("//*[@id='res']")).getAttribute("innerHTML");
	 System.out.println(str1);
	 System.out.println(str2);
	  
	   driver.quit();
	    

	}

}
