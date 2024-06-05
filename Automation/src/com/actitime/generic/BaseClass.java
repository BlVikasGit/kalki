package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeTest(groups = {"smoketest","regressiontest"})
	public void openBrowser(String browser) {
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equals("Edge")) {
			driver=new EdgeDriver();
		}else if(browser.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		Reporter.log("openBrowser",true);
	}	@BeforeMethod(groups = {"smoketest","regressiontest"})
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Reporter.log("login",true);
	}	@AfterMethod(groups = {"smoketest","regressiontest"})
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logout",true);
	}	@AfterTest(groups = {"smoketest","regressiontest"})
	public void closeBrowser() {
		driver.manage().window().minimize();
		driver.quit();
		Reporter.log("closeBrowser",true);
	}	
}
