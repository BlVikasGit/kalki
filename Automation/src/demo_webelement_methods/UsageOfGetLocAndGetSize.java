package demo_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocAndGetSize {
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement email = driver.findElement(By.id("email"));
WebElement pwd = driver.findElement(By.id("passContainer"));
//getSize() is used to get the dimension(size) of an element
Dimension d1 = email.getSize();		int h1 = d1.getHeight();		int w1 = d1.getWidth();
Dimension d2 = pwd.getSize();		int h2 = d2.getHeight();		int w2=d2.getWidth();
if(h1==h2&&w1==w2) {
	System.out.println("pass both are same size");
}else 
	System.out.println("fail both are of not same size");
//getLocation() is used to get the point(Location) of an element in webpage
Point p1 = email.getLocation();		int x1 = p1.getX();
Point p2 = pwd.getLocation();		int x2=p2.getX();
if(x1==x2) {
	System.out.println("pass both are properly aligned");
	}else
		System.out.println("fail both are not aligned properly ");
	driver.quit();
	}
}
