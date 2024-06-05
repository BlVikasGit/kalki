package demo_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCSSValue {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.facebook.com");
//getCssValue() is used to fetch the css property of an element.Since there will be multiple
//properties we need to pass String propertyName as parameter.
String value = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
System.out.println(value);
driver.quit();
}
}