package demo_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void demoA() {
		Reporter.log("Hello World", true);//It will print both on report and console
	}
	@Test
	public void demoC() {
		Reporter.log("Bye World",false);//It will print only in report
		Reporter.log("Bye World");//It will print only in report
	}
	@Test
	public void demoB() {
		System.out.println("Hi World");//It will print only in console
	}


}
