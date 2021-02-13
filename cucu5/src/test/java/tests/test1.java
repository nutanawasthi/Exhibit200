package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nutan\\eclipse-workspace2\\cucu5\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/Agile_Project/Agi_V1/index.php");

		driver.findElement(By.name("uid")).sendKeys("1303");
		
		driver.findElement(By.name("password")).sendKeys("Guru99");
		
		driver.findElement(By.name("btnLogin")).click();;
		
		
		
		
		
		
		
		
		
		
	}

}
