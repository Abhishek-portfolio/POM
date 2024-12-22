package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {
	public static WebElement username;
	public static WebElement password;
	public static WebElement submit;
	
		@Test
		public void login(){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhishek\\OneDrive\\Desktop\\Selenium Drivers\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			PageFactory.initElements(driver, LoginWithoutFindBy.class);
			
			username.sendKeys("Admin");
			password.sendKeys("admin123");
			submit.click();
		}
}