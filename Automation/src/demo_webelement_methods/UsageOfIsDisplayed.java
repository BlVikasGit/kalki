package demo_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayed {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//isDisplayed() is used to check whether the element is displayed or not
	boolean res = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	if(res==true) {
		System.out.println("Element is displayed");
	}else {
		System.out.println("Element is not displayed");
	}
	driver.quit();
}
}
