package KTCTC.JuneMavenProjectAutomation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	
	@Test(dataProvider = "getSingleDimentionArray")
	public void sampleMethod(String a)
	{
		System.out.println(a);
	}
	@Test(dataProvider = "getTwoDimentionArray")
	public void sampleMethod2(int a, int b)
	{
		System.out.println("Value of a = "+a + " Value of b = "+b);
	}
	
	@DataProvider (name = "getSingleDimentionArray")
	public String[] dataSenderMethod()
	{
		String[] data = {"Welcome","To","Selenium","KTCTC"};
		
		return data;
	}
	
	@DataProvider (name = "getTwoDimentionArray")
	public Object[][] dataSenderMethod2()
	{
		Object[][] data = {{23,45},{67,89}};
		
		return data;
	}

}
