package handling_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class PIB {
public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver d=new ChromeDriver(opt);
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://pib.gov.in/");
	d.switchTo().alert().accept();
	d.findElement(By.linkText("Ministry of Textiles")).click();
	d.switchTo().alert().accept();
	Set<String> allWid = d.getWindowHandles();
for (String wid : allWid) {
	d.switchTo().window(wid);
}
	System.out.println(d.getTitle());
}
}
