package TESTNG.demoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo4 {
	public WebDriver dr;
	@Parameters({"browser"})
	@Test
	public void test3(String browser) {
		if (browser.equals("Chrome")) {
				 dr=new ChromeDriver();
				
	}else if (browser.equals("Firefox")) {
		 dr=new FirefoxDriver();
			
}else if (browser.equals("Edge")) {
	 dr=new EdgeDriver();
		
}
	dr.get("https://www.google.co.in");	
	
	dr.manage().window().maximize();
	
	}
	

}
