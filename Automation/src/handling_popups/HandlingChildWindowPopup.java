package handling_popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindowPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://secure.indeed.com/");
		d.findElement(By.id("login-google-button")).click();
		d.findElement(By.id("apple-signin-button")).click();
		Set<String> allWid = d.getWindowHandles();
		for (String wid : allWid) {
			d.switchTo().window(wid);
//			System.out.println(d.getTitle());
			d.close();
		}
	}
}
