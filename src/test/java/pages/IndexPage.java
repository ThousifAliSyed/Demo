package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndexPage  {
	WebDriver driver;
	
	public IndexPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click() {
		driver.findElement(By.xpath("//a[text()='Form Authentication']")).click();
	}
	

//  IndexPage(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}

//@FindBy(xpath="//a[text()='Form Authentication']")
//  WebElement link_FormAuthentication;
	
  
//  public void clinkOnFormAuthenticationLink() {
//	  link_FormAuthentication.click();
//  }
}
