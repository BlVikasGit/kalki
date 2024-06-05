package demo_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();Thread.sleep(2000);
//	driver.findElement(By.xpath("//label[text()='Male']/../input")).click();
//isSelected() is used to check whether radio button or checkBox is selected or not
	boolean res = driver.findElement(By.xpath("//label[text()='Male']/../input")).isSelected();
	if(!res) {
		System.out.println("Radio button is not selected");
	}else {
		System.out.println("Radio button is selected");
	}
	driver.quit();
}
}
