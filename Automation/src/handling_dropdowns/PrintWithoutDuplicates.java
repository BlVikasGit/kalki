package handling_dropdowns;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutDuplicates {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr);
	Set<String> hs=new HashSet<>();
	List<WebElement> allEle = s.getOptions();
	for(int i=0;i<allEle.size();i++) {
		WebElement ele = allEle.get(i);
		String text = ele.getText();
		hs.add(text);
	}
	for (String text : hs) {
		System.out.println(text);
	}
	driver.quit();

}
}
