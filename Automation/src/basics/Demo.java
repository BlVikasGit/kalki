package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {
	public static void main(String[] args) {
	//Creating an object of brower specific class and storing it in WebDriver reference
	//It is an example of upcasting
	WebDriver driver = new ChromeDriver();
	//get() is used to trigger the url of the application
	driver.get("https://www.google.com");
	//getTitle() is used to get the title of current webpage
	String title = driver.getTitle();
	System.out.println(title);
	//getCurrentUrl() is used to get the url of the current webpage
	String url = driver.getCurrentUrl();
	System.out.println(url);
	//close() is used to close the current browser
	driver.close();
	}
}
