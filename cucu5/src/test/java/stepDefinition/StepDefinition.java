package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class StepDefinition {


	WebDriver driver;

	public static LoginPage lp;

	static String alertclose= null;


	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nutan\\eclipse-workspace2\\cucu5\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		lp= new LoginPage(driver); 
	}

	@Given("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}
	@When("user enters userId as {string} and password as {string}")
	public void user_enters_user_id_as_and_password_as(String UserID, String Password) throws InterruptedException {
		lp.setUserId(UserID);
		System.out.println("user id entered is: "+UserID );
		Thread.sleep(2000);
		lp.setpassword(Password); 
		Thread.sleep(2000);
		System.out.println("user password entered is: "+Password );
	}
	@Then("the tilte of page should not be {string}")
	public void the_tilte_of_page_should_not_be(String Expected_Title) {
		String Actual_Title=driver.getTitle();

		
		Assert.assertNotEquals(Expected_Title, Actual_Title);
		alertclose="close";
		System.out.println("page title don't match");
		
	}


	@When("user clicks LogIn button")
	public void user_clicks_log_in_button() {
		lp.clickLogin();
	}

	@Then("the tilte of page should be {string}")
	public void the_tilte_of_page_should_be(String Expected_Title) {
		try {
		String Actual_Title=driver.getTitle();

		Assert.assertEquals(Actual_Title, Expected_Title);
		
			System.out.println("The assert passed");
			
			}
		catch(Exception e) {
			System.out.println("error is"+ e.getMessage());
			}
		}
			


	@When("user clicks LogOut button")
	public void user_clicks_log_out_button() throws InterruptedException {
		lp.clickLogOut();
		Thread.sleep(300);
		driver.switchTo().alert().accept();
		System.out.println("The assert is accepted");
		
	}

	@Then("Browser should close")
	public void browser_should_close() {
		
		if (alertclose.contains(null)){
			driver.quit();
		}
		else { 
			
		driver.switchTo().alert().accept();
			driver.quit();
		
		}
	}


}
