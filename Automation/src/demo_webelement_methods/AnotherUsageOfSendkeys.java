package demo_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherUsageOfSendkeys {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("Virat"+Keys.CONTROL+"ac");
	driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
	driver.findElement(By.linkText("Sign Up")).submit();
}
}
