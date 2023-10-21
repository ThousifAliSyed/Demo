package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class LoginPage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login() {
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
//	LoginPage(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}
	@FindBy(id="username")
	WebElement textbox_Username;
	
	@FindBy(id="password")
	WebElement textbox_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit_Button;
	
//	driver.findElement(By.id("username")).sendKeys("tomsmith");
//	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//	
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
	
	public void enterUserName() {
		textbox_Username.sendKeys("tomsmith");	
	}
	public void enterPassWord() {
		textbox_password.sendKeys("SuperSecretPassword!");
	}
	public void clickonSubmitButton() {
		submit_Button.click();
	}
	
}
