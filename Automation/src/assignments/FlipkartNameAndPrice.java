package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNameAndPrice {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("Iphone 14 pro max"+Keys.ENTER);
List<WebElement> allMob = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));
	List<WebElement> allPrices = driver.findElements(By.xpath
	("//div[contains(text(),'Apple iPhone')]/../../div[2]/div[1]/div[1]/div[1]"));
for(int i=0;i<allMob.size()&&i<allPrices.size();i++) {
	String name = allMob.get(i).getText();
	String price=allPrices.get(i).getText();
//	System.out.println("Mobile name: "+name+" price: "+price);
	System.out.println(name+" ==> "+price);
	}driver.quit();
	
}
}
