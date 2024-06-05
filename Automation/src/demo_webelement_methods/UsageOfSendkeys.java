package demo_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendkeys {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.id("email"));Thread.sleep(2000);
//sendKeys() is used to enter the text to the textBox
	email.sendKeys("ViratKohli@gmail.com");Thread.sleep(2000);
//clear() is used to clear the text in the textBox
	email.clear();Thread.sleep(2000);
	email.sendKeys("MSD@csk.com");
}
}
