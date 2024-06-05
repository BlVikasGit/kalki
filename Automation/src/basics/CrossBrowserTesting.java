package basics;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the browser name");
	String browser = s.nextLine();
	if(browser.equals("Chrome")) {
		driver=new ChromeDriver();
	}else if(browser.equals("Edge")) {
		 driver=new EdgeDriver();
	}else {
		 driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	System.out.println(js.executeScript("return document.title"));
	String url = (String) js.executeScript("return document.URL");	
	System.out.println(url);	
	driver.quit();
}
}
