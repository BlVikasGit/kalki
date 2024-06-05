package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	@FindBy(id="username")
	private WebElement unTbx;
	@FindBy(name="pwd")								//Declaration
	private WebElement pwdTbx;
	@FindBy(partialLinkText = "Login")
	private WebElement loginBtn;
		//Business logic method
	public void login(String un,String pwd) {
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);						//Utilization
		loginBtn.click();
	}
}
