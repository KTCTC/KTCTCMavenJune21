package KTCTC.JuneMavenProjectAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertsInTestNG {
	
	
	
	@Test
	  public void A()
	  {
		 SoftAssert sassert = new SoftAssert();
		  System.out.println("Method A from SoftAssertsInTestNG");		
		  String str = "Hello";
		  sassert.assertTrue(false, "Expecting elementy to be visible");
		  sassert.assertEquals("Hi", str, "Message is not displayed properly");
		  System.out.println("After assertion A Method");
		  sassert.assertAll();
		  System.out.println("After assert All");
	  }
	  @Test
	  public void B()
	  {
		  SoftAssert sassert = new SoftAssert();
		
		  System.out.println("Method B from SoftAssertsInTestNG");
		  sassert.assertNull(sassert);
		  System.out.println("After assertion B Method");
		  sassert.assertAll();
		  
	  }
	  
	 

}
