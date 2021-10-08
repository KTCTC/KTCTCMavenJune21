package KTCTC.JuneMavenProjectAutomation;


import org.testng.annotations.Test;

public class AnnotaionsInTestNG extends TestBase{

	@Test
	public void verfyUserCanLoginWithVAlidCredentials() {
		System.out.println("verfy User Can Login With VAlid Credentials");

	}
  @Test
	public void verfyUserCanNotLoginWithInvalidUserNameAndValidPassWord() {
		System.out.println("verfy User Can Not Login With Invalid User Name And Valid PassWord");

	}
  @Test
  public void A()
  {
	  System.out.println("Method A");
  }
  @Test
  public void B()
  {
	  System.out.println("Method B");
	  
  }
  



}
