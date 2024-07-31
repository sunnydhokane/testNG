package TESTNG.demoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demo3 {
	@Test
	public void testTitke() {
		
		SoftAssert sa=new SoftAssert();
		String expText="Search";
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("https://www.ebay.com");
		System.out.println(dr.getTitle());
		System.out.println("Verifying title");
//		String exptitle="Electronics";
		
		String exptitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String acttitle=dr.getTitle();
		sa.assertEquals(acttitle,exptitle);
		System.out.println("verifying text");
		String actText=dr.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		sa.assertEquals(actText,expText,"comparing text..");
		sa.assertAll();
		
		
		
		
		
	}

}
