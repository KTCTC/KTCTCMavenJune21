package KTCTC.JuneMavenProjectAutomation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.testng.annotations.Test;

public class LinksInSelenium2 {
	
	@Test
	public void getLinkStatus() throws IOException
	{
		URL url = new URL("https://demoqa.com/links");
		
		HttpsURLConnection http = (HttpsURLConnection)url.openConnection();
		
		http.setConnectTimeout(15000);
		
		http.connect();
		
		int dd = http.getResponseCode();
		
		System.out.println(dd);
		
		System.out.println(http.getResponseMessage());
		
	}

}
