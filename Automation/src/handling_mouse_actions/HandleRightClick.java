package handling_mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleRightClick {
public static void main(String[] args) throws AWTException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
	WebElement link = d.findElement(By.cssSelector("a[title='Kannada']"));
	Actions a=new Actions(d);
	a.contextClick(link).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
}
}
