package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIndividualFrames {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2&scenario=2");
	Thread.sleep(2000);
	d.switchTo().frame(0);
	d.findElement(By.id("email")).sendKeys("Virat@18");
	d.findElement(By.id("password")).sendKeys("Anushka");
	d.findElement(By.id("confirm-password")).sendKeys("Anushka");
	d.switchTo().parentFrame();
	d.switchTo().frame(1);
	d.findElement(By.id("username")).sendKeys("Dinga");
	d.findElement(By.id("password")).sendKeys("Dingi");
}
}
