package KTCTC.JuneMavenProjectAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentTestInTestNG {
	
	@Test 
	public void A()
	{
		System.out.println("Method A from DependentTestInTestNG");		
		Assert.assertTrue(true);
		
	}
	@Test (dependsOnMethods = {"A"})
	public void B()
	{
		System.out.println("Method B from PrioritiesInTestNG");		
			Assert.assertTrue(false);		
		
		
	}	
	
	@Test (dependsOnMethods = {"B", "A"}, enabled = false)
	public void C()
	{
		System.out.println("Method C from DependentTestInTestNG");		
		
	}
	@Test 
	public void D()
	{
		System.out.println("Method D from DependentTestInTestNG");
		
			Assert.assertTrue(false);		
		
		
	}
	

}
