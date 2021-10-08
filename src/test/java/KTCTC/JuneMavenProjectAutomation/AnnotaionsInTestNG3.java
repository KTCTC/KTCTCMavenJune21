package KTCTC.JuneMavenProjectAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotaionsInTestNG3 extends TestBase {

	
  @Test
  public void A()
  {
	  System.out.println("Method A from third class");
  }
  @Test
  public void B()
  {
	  System.out.println("Method B from third class");
	  
  }
  
  


}
