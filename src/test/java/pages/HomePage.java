package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validateHomePage() {
		Assert.assertTrue(driver.findElement(By.xpath("//i[text()=' Logout']")).isDisplayed());
	}
	
//	HomePage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//
//	@FindBy(xpath="//i[text()=' Logout']")
//	WebElement logout_Button;

	//Assert.assertTrue(driver.findElement(By.xpath("//i[text()=' Logout']")).isDisplayed());
	
	
//	public boolean validateHomePageLogoutButton() {
//		boolean flag=logout_Button.isDisplayed();
//		Assert.assertTrue(true);
//		return flag;
//	}
}
