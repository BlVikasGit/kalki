
package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test( groups = {"smoketest","regressiontest"})	
	public void createCustomer() throws InterruptedException {
		driver.findElement(By.linkText("TASKS")).click();
		Reporter.log("createCustomer",true);
		Thread.sleep(2000);
	}
//	@Test(groups = "regressiontest")
//	public void modifyCustomer() {
//		Reporter.log("modifyCustomer",true);
//	}	
//	@Test(groups = "regressiontest", dependsOnMethods = "createCustomer")
//	public void deleteCustomer() {
//		Reporter.log("deleteCustomer",true);
//	}
}
