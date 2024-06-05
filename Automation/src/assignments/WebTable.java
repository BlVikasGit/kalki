package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/QSP/Desktop/static%20webpages/TABLEA.html");
		List<WebElement> allEle = driver.findElements(By.tagName("td"));
		for(int i=0;i<allEle.size();i++) {
			String text = allEle.get(i).getText();
			System.out.println(text);
		}driver.quit();
	}
}
