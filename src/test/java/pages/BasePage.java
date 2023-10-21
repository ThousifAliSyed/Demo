package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		 
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 }
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
