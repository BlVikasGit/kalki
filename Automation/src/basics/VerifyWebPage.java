package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="Facebook";
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.FACEBOOK.com/";
		if(actualTitle.contains(expectedTitle)&&actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Pass: Both title and url are same");
		}else {
			System.out.println("Fail: Both title and url are not same");
		}
		driver.close();
	}
}
