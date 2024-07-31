package TESTNG.demoTestNG;

import org.testng.annotations.Test;

public class logtest {
	@Test(priority=1)
	public void btest() {
		System.out.println("hi welcome to test 2");
	}
	@Test(priority=2)
	public void atest() {
		System.out.println("hi welcome to test");
		
	}
	
}
