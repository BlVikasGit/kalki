package demo_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCssSelectors {
	public static void main(String[] args) {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("file:///C:/Users/QSP/Desktop/Demo.html");
	d.findElement(By.cssSelector("a[id='d1']")).click();
	d.navigate().back();
	d.findElement(By.cssSelector("a[name='n2']")).click();
	d.navigate().back();
	d.findElement(By.cssSelector("a[class='c 1']")).click();
	d.navigate().back();
	d.findElement(By.cssSelector("a[href='https://www.instagram.com']")).click();
	}
}
