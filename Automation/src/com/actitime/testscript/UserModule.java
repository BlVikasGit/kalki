package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class UserModule extends BaseClass{
	@Test(groups = "smoketest")
	public void createUser() throws InterruptedException {
		driver.findElement(By.linkText("USERS")).click();
		Reporter.log("createUser",true);
		Thread.sleep(2000);
	}
//	@Test(groups = "regressiontest")
//	public void modifyUser() {
//		Reporter.log("modifyUser",true);
//	}
//	@Test(groups = "regressiontest")
//	public void deleteUser() {
//		Reporter.log("deleteUser",true);
//	}
}
