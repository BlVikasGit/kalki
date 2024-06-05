package handling_dropdowns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicates {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr);
	List<WebElement> allEle = s.getOptions();
	Set<String> hs=new HashSet<>();
	List<String>al=new ArrayList<>();
	for(int i=0;i<allEle.size();i++) {
		String text = allEle.get(i).getText();
		boolean res = hs.add(text);
		if(!res) {
			al.add(text);
		}
	}
	for (String string : al) {
		System.out.println(string);
	}driver.quit();
}
}
