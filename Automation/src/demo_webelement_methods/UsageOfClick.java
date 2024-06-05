package demo_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClick {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement ele = driver.findElement(By.linkText("Sign Up"));
//click() is used to click on web elements like links, buttons, radio button, checkbox etc
//It will scroll until elements in static web pages
	ele.click();
}
}
