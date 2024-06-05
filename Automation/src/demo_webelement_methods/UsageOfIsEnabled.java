package demo_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.facebook.com/");
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
//isEnabled() is used to check whether the ele is enabled or disabled( i cannot perform any action)
//	boolean res = driver.findElement(By.name("login")).isEnabled();
	boolean res = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	if(res) {
		System.out.println("Login button is enabled");
	}else {
		System.out.println("Login button is disabled");
	}
	driver.quit();
}
}
