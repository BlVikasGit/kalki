package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HiddenDivisionPopup {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demoapps.qspiders.com/ui/hidden");
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("Virat");
		d.findElement(By.cssSelector("input[type='email']")).sendKeys("Virat@18");
		WebElement dd = d.findElement(By.xpath("//select[@name]"));
		Select s=new Select(dd);
		s.selectByIndex(1);
		d.findElement(By.tagName("textarea")).sendKeys("He is a cricketer");
		d.findElement(By.id("hiddendiv")).click();
	}
}
