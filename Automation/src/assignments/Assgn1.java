package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assgn1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("url.com");
	WebElement ele = driver.findElement(By.id("button"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("document.getElementById('d2').click()");
	Set<String> allWid = driver.getWindowHandles();
	for (String wid : allWid) {
		driver.switchTo().window(wid);
	}
	System.out.println(driver.getTitle());
	
}
}
