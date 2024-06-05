package handling_dropdowns;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutDuplicatesInSorted {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr);
	Set<String> ts=new TreeSet<>();
	List<WebElement> allEle = s.getOptions();
	for(int i=0;i<allEle.size();i++) {
		WebElement ele = allEle.get(i);
		String text = ele.getText();
		ts.add(text);
	}
	for (String text : ts) {
		System.out.println(text);
	}
	driver.quit();

}

}
