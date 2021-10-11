package KTCTC.JuneMavenProjectAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ScreeShotInSelenium {

	WebDriver driver = null;

	@Test
	public void screenShotMethod() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("http://demo.guru99.com/test/upload/");

		driver.findElement(By.id("uploadfile_0")).sendKeys(System.getProperty("user.dir") + "\\AB.properties");

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();

		WebDriverWait wt = new WebDriverWait(driver, 10);

		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='res']//center"))));

		String data = driver.findElement(By.xpath("//*[@id='res']//center")).getText().replace("\n", " ");
		System.out.println(data);

		Assert.assertEquals(data, "1 file has been successfully uploaded.");

	}

	@AfterMethod
	public void methodSS(ITestResult itr)

	{

		System.out.println("Inside after test method");
		System.out.println(itr.getStatus());

		if (itr.getStatus() == ITestResult.FAILURE) {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File f = ts.getScreenshotAs(OutputType.FILE);

			File img = new File(System.getProperty("user.dir") + "\\uploadPageAfterFailure.png");

			try {
				FileUtils.copyFile(f, img);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("after after method");

		}

	}

}
