package handling_mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleScrolling {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Sign Up"));
		Actions a=new Actions(driver);
		//scrollByAmount(int x,int y) it will scroll to mentioned pixel
		a.scrollByAmount(0, 287).perform();
		//scrollToElement(WE ele)will scroll to the particular element
		a.scrollToElement(link).perform();
	}
}
