package assignments;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_mouse_hover {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	List<WebElement> allTabs = driver.findElements(By.className("desktop-main"));
	Actions a=new Actions(driver);
	for (WebElement ele : allTabs) {
		a.moveToElement(ele).pause(2000).perform();
	}
	for(int i=allTabs.size()-1;i>=0;i--) {
		a.moveToElement(allTabs.get(i)).pause(2000).perform();
	}
	
}
}
