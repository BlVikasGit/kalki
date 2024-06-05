package handling_dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfGetOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/hotel.html");
		WebElement ele=driver.findElement(By.id("mtr"));
		Select s=new Select(ele);
//It is used to get all the options in the dropdown
		List<WebElement> allEle = s.getOptions();
		int count=allEle.size();		System.out.println(count);
		for(int i=0;i<allEle.size();i++) {
WebElement ele1 = allEle.get(i);	String text = ele1.getText();		System.out.println(text);}
		for(int i=0;i<count;i++) {
			s.selectByIndex(i);		}//Select in ascending order
		for(int i=count-1;i>=0;i--) {
			s.deselectByIndex(i);	}//Deselecting in descending order
		for (WebElement webEle : allEle) {
			//String text = webEle.getText();					s.selectByVisibleText(text);
			String value = webEle.getAttribute("value");		s.selectByValue(value);
		}
		driver.quit();
	}
}
