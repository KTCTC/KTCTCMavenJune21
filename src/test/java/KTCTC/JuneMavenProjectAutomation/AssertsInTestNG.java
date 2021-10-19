package KTCTC.JuneMavenProjectAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsInTestNG {
	
	WebDriver driver;
	
	int a=90;
	  @Test
	  public void A()
	  {
		  System.out.println("Method A from second classs");		  
		  Assert.assertTrue(true);
		  
		  Assert.assertTrue(true, "Validation message is not displayed");
		  
		  Assert.assertFalse(false);
		  
		  Assert.assertFalse(true, "Assertion is failed expecting false");
		  System.out.println("After assertion");
	  }
	  @Test
	  public void B()
	  {
		  String str = "Hi";
		  String str1 = "23";
		  Assert.assertEquals("Hi", str, "Message is not matching");
		  
		  Assert.assertEquals(23, Integer.parseInt(str1));
	
		  
		  Assert.assertNotEquals(str, "Hi", "Strings are matching");
		  
		 
		  
		  System.out.println("Method B from second class");
		  
	  }
	  
	  @Test
	  public void C()
	  {
		  AssertsInTestNG obj = new AssertsInTestNG();
		  System.out.println("Object = "+ obj);
		
		  Assert.assertNull(driver);
		  Assert.assertNotNull(obj);
		 
		  
		  System.out.println("Method C from second class");
		  
	  }  
	  public static boolean isElementPresentOnUI(WebDriver driv, String xPath)
		{
			boolean flag = false;
			
			try {
				flag = driv.findElement(By.xpath(xPath)).isDisplayed();
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
			
			return flag;
		
		}

}
