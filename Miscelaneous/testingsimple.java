package AssignmentDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DriverInit.DriverStart;

public class testingsimple {
	WebDriver driver;
	
	public testingsimple(WebDriver driver) {
      this.driver = driver;
	}
	
	testingsimple(){
		DriverStart obj = new DriverStart();
		driver = obj.init();
	}
	
	WebElement emailLogin=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")); //login email
	WebElement passwordLogin=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")); //login password
	WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Login')]")); //Login button
	WebElement SignupLogin= driver.findElement(By.linkText("/login"));//signup-login button
	
	public void navigation() throws InterruptedException {
		driver.get("https://automationexercise.com/category_products/6");
	}
	
	public void clickLoginSignupButton() {
		SignupLogin.click();
	}
	public void setLoginEmail(){
		emailLogin.sendKeys("sonalssharma06@gmail.com");
		
	}
	
	public void setPassword() {
		passwordLogin.sendKeys("123qqqwwW&");
		
	}
	
	public void clickloginButton() {
		loginButton.click();
	}
	
	@Test
	public void runMethod() throws InterruptedException {
		testingsimple obj1 = new testingsimple();
		obj1.navigation();
//		clickLoginSignupButton();
//		setLoginEmail();
//		setPassword();
//		clickloginButton();
		
	}
	
}
