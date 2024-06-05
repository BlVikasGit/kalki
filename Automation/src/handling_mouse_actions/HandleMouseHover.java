package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseHover {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.vtiger.com/");
		WebElement target = d.findElement(By.linkText("Resources"));
		Actions a=new Actions(d);
		a.moveToElement(target).perform();
		d.findElement(By.linkText("Contact Us")).click();
		String contactNum = d.findElement(By.xpath
							("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		System.out.println(contactNum);
	}
}
