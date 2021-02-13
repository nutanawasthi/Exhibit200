package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(name="uid")
	WebElement txtUserId;
	

	@FindBy(name="password")
	WebElement txtpassword;

	@FindBy(name="btnLogin")
	WebElement btnLogin;

	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement LnkLogOut;
	
	
	public void setUserId(String uid) {
		txtUserId.clear();
		txtUserId.sendKeys(uid);
		
	}
	
	public void setpassword(String password) {
		txtpassword.clear();
		txtpassword.sendKeys(password);
		
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickLogOut() {
		LnkLogOut.click();
	}
	
}
