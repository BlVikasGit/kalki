package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFrames {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/T1.html");
		driver.findElement(By.id("t1")).sendKeys("1");
//frame(int Index) will transfer the control to frame with the respective index
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("2");
//frame(Str Id/name)will transfer the control to frame with the specified id/name att in <iframe> tag
		driver.switchTo().frame("f2");
		driver.findElement(By.id("t3")).sendKeys("3");
//parentFrame() is used to transfer the control from current frame to previous frame
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t2")).sendKeys("-4");
		WebElement ele = driver.findElement(By.id("f2"));
//frame(WebEle ele)will transfer the control to frame with the element address of <iframe> tag
		driver.switchTo().frame(ele);
		driver.findElement(By.id("t3")).sendKeys("-5");
//defaultContent() will transfer the control to the main browser webpage
		driver.switchTo().defaultContent();
		driver.findElement(By.tagName("input")).sendKeys("-6");}

}
