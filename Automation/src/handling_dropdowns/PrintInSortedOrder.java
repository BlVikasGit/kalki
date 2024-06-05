package handling_dropdowns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PrintInSortedOrder {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr);
	List<String> al=new ArrayList<>();
	List<WebElement> allEle = s.getOptions();
	for(int i=0;i<allEle.size();i++) {
		WebElement ele = allEle.get(i);
		String text = ele.getText();
		al.add(text);
	}
//	al.sort(null);
	Collections.sort(al);
	for (String text : al) {
		System.out.println(text);
	}
	driver.quit();
}
}
