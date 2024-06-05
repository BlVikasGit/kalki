package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearnSERE {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/Demo.html");
//WE are finding the element storing it in link reference variable(@01)
	WebElement ele = driver.findElement(By.id("d1"));
//If we refresh the same page also address will be changed
//	driver.navigate().refresh();
	ele.click();
	driver.navigate().back();
//Once after clicking the page will be reloaded and address will be changed(@03)
	ele.click();
	}
}
