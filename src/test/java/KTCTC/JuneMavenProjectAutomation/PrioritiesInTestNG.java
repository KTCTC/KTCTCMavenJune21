package KTCTC.JuneMavenProjectAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrioritiesInTestNG {
	
	@Test (priority = -7)
	public void C()
	{
		System.out.println("Method C from PrioritiesInTestNG");		
		
	}
	@Test (priority = 1, invocationCount = 2)
	public void D()
	{
		System.out.println("Method D from PrioritiesInTestNG");
		
			Assert.assertTrue(false);		
		
		
	}
	@Test 
	public void A()
	{
		System.out.println("Method A from PrioritiesInTestNG");		
		
	}
	@Test (priority = 3)
	public void B()
	{
		System.out.println("Method B from PrioritiesInTestNG");		
			Assert.assertTrue(false);		
		
		
	}
	

}
