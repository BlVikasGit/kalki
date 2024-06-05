package handling_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito","--disable-notifications","--start-maximized");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.yatra.com");
	}
}
