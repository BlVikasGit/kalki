package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass{
	@Test(groups = "smoketest")
	public void createProject() throws InterruptedException {
		driver.findElement(By.linkText("REPORTS")).click();
		Thread.sleep(2000);
		Reporter.log("createProject",true);
	}
//	@Test(groups = "regressiontest")
//	public void modifyProject() {
//		Reporter.log("modifyProject",true);
//	}
//	@Test(groups = "regressiontest")
//	public void deleteProject() {
//		Reporter.log("deleteProject",true);
//	}
}
