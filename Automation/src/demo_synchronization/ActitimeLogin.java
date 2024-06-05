package demo_synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/abc14/login.do");
		driver.findElement(By.id("username")).sendKeys("blvikas8@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("qmQEbjup");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		for(int i=0;i<1000;i++) {
			try {
			driver.findElement(By.id("logoutLink")).click();
			break;
		}catch (NoSuchElementException e) {
			System.out.println(i);
		}
		}
		}
}













//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
//wait.until(ExpectedConditions.titleIs("actiTIME -  Enter Time-Track"));
//System.out.println(driver.getTitle());