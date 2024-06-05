package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfQuit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();Thread.sleep(2000);
		driver.manage().deleteAllCookies();//It is used to delete all the cookies
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.get("https://secure.indeed.com/");Thread.sleep(2000);
		driver.manage().window().fullscreen();Thread.sleep(2000);
//		driver.findElement(By.id("login-google-button")).click();
		//quit() is used to close all the browser or tabs
		driver.manage().window().minimize();Thread.sleep(2000);
		driver.quit();
	}
}
