package demo_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class VerifyTitle {
	@Test
	public void demo() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		String aTitle = d.getTitle();
		String eTitle="Googly";
		Assert.assertEquals(aTitle, eTitle);
		SoftAssert s=new SoftAssert();
		s.assertEquals(aTitle, eTitle);
		d.quit();
		s.assertAll();
	}
}
