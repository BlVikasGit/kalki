package datadriven_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameterization {
//@Parameters({"url","un","pwd"})
@Test(dataProvider = "sendData",dataProviderClass = LearnDataProvider.class)
public void getData(String url,String un,String pwd) {
WebDriver d=new ChromeDriver();
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
d.get(url);
d.findElement(By.id("username")).sendKeys(un);
d.findElement(By.name("pwd")).sendKeys(pwd);
d.findElement(By.xpath("//div[text()='Login ']")).click();
d.findElement(By.id("logoutLink")).click();
d.quit();
}
}
