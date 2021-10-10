package KTCTC.JuneMavenProjectAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountInTestNG {
	int count =0;
	@Test (invocationCount = 5, enabled = false)
	public void addMultipleData()
	{
		System.out.println("Hi checking for invocation count");
		count++;
		if (count==4)
		{
			Assert.assertTrue(false);
		}
		
		
		
	}
	@Test (invocationCount = 5)
	public void B()
	{
		System.out.println("Hi checking for invocation count in Method B");
		count++;
		if (count==4)
		{
			Assert.assertTrue(false);
		}
		
		
		
	}

}
