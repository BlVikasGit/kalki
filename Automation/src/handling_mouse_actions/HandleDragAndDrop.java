package handling_mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDragAndDrop {
public static void main(String[] args) throws InterruptedException {
WebDriver d=new ChromeDriver();
d.manage().window().maximize();
d.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
WebElement src1 = d.findElement(By.className("draghandle"));
WebElement src2 = d.findElement(By.xpath("//h1[text()='Block 2']"));
WebElement dest = d.findElement(By.id("column-3"));
Actions a=new Actions(d);
a.clickAndHold(src1).moveToElement(dest).pause(2000).release().perform();
Thread.sleep(2000);
a.dragAndDrop(src2, dest).perform();
}
}
