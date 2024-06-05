package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		WebElement ele = driver.findElement(By.xpath("//h2[text()='Earth']"));
		int yAxis = ele.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scrollTo() will scroll the element to the top of the webpage
		js.executeScript("window.scrollTo(0," + yAxis + ")");
		Actions a = new Actions(driver);
		// scrollToElement() will scroll the element to the bottom of the webpage
		a.scrollToElement(ele).perform();
	}
}