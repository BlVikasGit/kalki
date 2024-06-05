package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintContentOfWebtable {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://cosmocode.io/automation-practice-webtable/");
	List<WebElement> allCountries = driver.findElements(By.xpath("//td[2]"));
	List<WebElement> allCapitals = driver.findElements(By.xpath("//td[3]"));
	List<WebElement> allCurrencies = driver.findElements(By.xpath("//td[4]"));
	List<WebElement> allLanguages = driver.findElements(By.xpath("//td[5]"));
	System.out.println(allCountries.size());
	for(int i=1;i<allCountries.size();i++) {
		String country = allCountries.get(i).getText();
		String capital=allCapitals.get(i).getText();
		String currency = allCurrencies.get(i).getText();
		String lang=allLanguages.get(i).getText();
		System.out.println("Country: "+country+" Capital: "
		+capital+" Currency: "+currency+" Languages: "+lang);
		}
	driver.quit();
}
}
