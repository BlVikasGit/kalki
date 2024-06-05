package handling_dropdowns;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DishIsPresentOrNot {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the dish name");
	String dish = scanner.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr);
	List<WebElement> allEle = s.getOptions();
	int count=0;
	for(int i=0;i<allEle.size();i++) {
		String text = allEle.get(i).getText();
		if(dish.equalsIgnoreCase(text)) {
			count++;
		}}
	if(count>0) {
		System.out.println(dish+" is present in the dropdown");
	}else {
		System.out.println(dish+" is not present in the dropdown");
	}driver.quit();
}
}
