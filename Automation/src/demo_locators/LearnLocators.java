package demo_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("file:///C:/Users/QSP/Desktop/Demo.html");
//	WebElement ele1 = d.findElement(By.tagName("a"));
//	ele1.click();
//	d.navigate().back();
//	WebElement ele2 = d.findElement(By.id("d2"));
//	ele2.click();
//	d.navigate().back();
//	WebElement ele3 = d.findElement(By.name("n1"));
//	ele3.click();
//	d.navigate().back();
//	d.findElement(By.className("c2")).click();
	d.findElement(By.className("c 2"));
}
}
