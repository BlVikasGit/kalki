package handling_dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement month = driver.findElement(By.id("month"));
	Select s=new Select(month);Thread.sleep(2000);
//selectByIndex(int ind) will select the option based upon the mentioned index
	s.deselectByIndex(0);Thread.sleep(2000);
//selectByValue(String value) will select the option based upon the mentioned value in value att
	s.selectByValue("12");Thread.sleep(2000);
//selectByVisibleText(String text) will select the option with the mentioned tagText
	s.selectByVisibleText("Jul");
	Thread.sleep(2000);
	driver.quit();
			
}
}
