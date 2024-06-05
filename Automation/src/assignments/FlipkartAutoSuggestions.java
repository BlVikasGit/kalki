package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Iphone");
		Thread.sleep(2000);
		List<WebElement> allSuggs = driver.findElements(By.xpath("//*[contains(text(),'iphone')]"));
		System.out.println(allSuggs.size());
		for (WebElement ele : allSuggs) {
			String text = ele.getText();
			System.out.println(text);
		}allSuggs.get(allSuggs.size()-1).click();
	}
}
