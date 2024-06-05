package demo_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethods {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
WebElement ele = driver.findElement(By.linkText("Forgotten password?"));
//getTagName() is used to get the tagName of the element
	String tag = ele.getTagName();
//getText()is used to get the tagText of an element.
//	If there is no tagText it will return empty spaces
	String text=ele.getText();
//getAttribute() is used to get the attValues of an element.Since there will be multiple
//attributes we need to pass String ATTName as parameter.
//If the Att is not present it will return null
String attVal=ele.getAttribute("href");//href att will contain url of links
	System.out.println(tag);
	System.out.println(text);
	System.out.println(attVal);
	driver.quit();
}
}
