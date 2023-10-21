package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

      public class E2E {
    	  
    	  public static WebDriver driver;
    	  
    	  public static void main(String [] args) {
    		  WebDriverManager.chromedriver().setup();
    			
    			 driver= new ChromeDriver(); 
    			driver.manage().window().maximize();
    			driver.get("https://the-internet.herokuapp.com/");
    			driver.findElement(By.xpath("//a[text()='Form Authentication']")).click();
    			driver.findElement(By.id("username")).sendKeys("tomsmith");
    			driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    			driver.findElement(By.xpath("//button[@type='submit']")).click();
    			Assert.assertTrue(driver.findElement(By.xpath("//i[text()=' Logout']")).isDisplayed());
    			driver.quit();
    			
    	  }
	
	
     
//       @BeforeTest	
//	   void Setup() {
//		WebDriverManager.chromedriver().setup();
//		
//		 driver= new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/");
//	}
//		@Test
//		 void LogInValidation() {
//		driver.findElement(By.xpath("//a[text()='Form Authentication']")).click();
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Assert.assertTrue(driver.findElement(By.xpath("//i[text()=' Logout']")).isDisplayed());
//		}
//	
}
