package handling_dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/hotel.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
	s.selectByIndex(0);		s.selectByValue("2");	s.selectByVisibleText("Puliogare");
//s.deselectByVisibleText("Idly");	s.deselectByIndex(1);	s.deselectByValue("3");
		s.deselectAll();
		WebElement drop2 = driver.findElement(By.id("food"));
		Select s1=new Select(drop2);
//It will get the 1st selected option, if no option are selected it will throw NSEE
		WebElement ele = s1.getFirstSelectedOption();
		System.out.println(ele.getText());
//It will get all the selected options,if no options are selected it will return empty list
		List<WebElement> allEle = s1.getAllSelectedOptions();
		int count = allEle.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			WebElement element = allEle.get(i);
			System.out.println(element.getText());
		}driver.quit();
		
		}
}
