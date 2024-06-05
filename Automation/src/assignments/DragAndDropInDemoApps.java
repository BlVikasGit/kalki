package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropInDemoApps {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		List<WebElement> allDraggable = driver.findElements(By.className("draggable"));
		WebElement drop1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
		WebElement drop2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']/.."));
		Actions a=new Actions(driver);
		for (WebElement ele : allDraggable) {
			if(ele.getText().contains("Mobile"))
				a.dragAndDrop(ele, drop1).perform();
			else if(ele.getText().contains("Laptop")){
				a.dragAndDrop(ele, drop2).perform();
			}
		}
	}
}
