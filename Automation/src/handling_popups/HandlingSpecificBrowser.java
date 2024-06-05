package handling_popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSpecificBrowser {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter he title");
		String expectedTitle=s.nextLine();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://secure.indeed.com/");
		d.findElement(By.id("login-google-button")).click();
		d.findElement(By.id("apple-signin-button")).click();
		Set<String> allWid = d.getWindowHandles();
		Iterator<String> i = allWid.iterator();
		while(i.hasNext()) {
			String wid = i.next();
			d.switchTo().window(wid);
			String title = d.getTitle();	
			if(title.contains(expectedTitle)) {
				d.close();
			}
		}
	}
}
