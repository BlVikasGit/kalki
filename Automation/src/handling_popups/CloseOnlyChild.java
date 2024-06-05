package handling_popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChild {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://secure.indeed.com/");
	d.findElement(By.id("login-google-button")).click();
	d.findElement(By.id("apple-signin-button")).click();
	Set<String> allWid = d.getWindowHandles();
	String pwid = d.getWindowHandle();//Parent window add
	for (String wid : allWid) {
		d.switchTo().window(wid);
		if(!wid.equals(pwid)) {		//Compare with par wid
			d.close();
		}		
	}
}
}
