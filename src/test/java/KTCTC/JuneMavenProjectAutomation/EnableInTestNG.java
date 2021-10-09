package KTCTC.JuneMavenProjectAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableInTestNG {
	 @Test (enabled = true)
	  public void A()
	  {
		  System.out.println("Method A from EnableInTestNG classs");		  
		  Assert.assertTrue(true);
		  
		  Assert.assertTrue(true, "Validation message is not displayed");
		  
		  Assert.assertFalse(false);
		  
		  Assert.assertFalse(true, "Assertion is failed expecting false");
		  System.out.println("After assertion");
	  }
	  @Test (enabled = false)
	  public void B()
	  {
		  String str = "Hi";
		  String str1 = "23";
		  Assert.assertEquals("Hi", str, "Message is not matching");
		  
		  Assert.assertEquals(23, Integer.parseInt(str1));
	
		  
		  Assert.assertNotEquals(str, "Hi", "Strings are matching");
		  
		 
		  
		  System.out.println("Method B from EnableInTestNG class");
		  
	  }

}
