package AssignmentDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DriverInit.DriverStart;

public class InvalidLoginTC2 {


	WebDriver driver;
	public InvalidLoginTC2(WebDriver driver) {
        this.driver = driver;
	}
	
	InvalidLoginTC2(){
		DriverStart obj= new DriverStart();
		driver= obj.init();
		PageFactory.initElements(driver, this);	
	}	
	
	WebElement emailLogin=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")); //login email
	WebElement passwordLogin=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")); //login password
	WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Login')]")); //Login button
	WebElement SignupLogin= driver.findElement(By.linkText("/login"));//signup-login button
	String LoginString =driver.findElement(By.tagName("h2")).getText();//Login to your account string
	WebElement loggedInText= driver.findElement(By.xpath("//a[contains(text(),' Logged in as ')]")); //logged in as username
	WebElement logoutButton= driver.findElement(By.xpath("//a[contains(text(),' Logout')]"));
	WebElement errorTextLogin= driver.findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect!')]"));

	public void navigation() throws InterruptedException {
		driver.get("https://automationexercise.com/category_products/6");
	}
	
	public void clickLoginSignupButton() {
		SignupLogin.click();
	}
	
	public void verifyLoginText()
	{
		if(LoginString.equals("Login to your account"))
		{
			System.out.println("User has entered login box");
		}
	}
	
	public void setIncorrectLoginEmail(){
		emailLogin.sendKeys("sonalssharma@gmail.com");
		
	}
	
	public void setIncorrectPassword() {
		passwordLogin.sendKeys("123");
		
	}
	
	public void clickloginButton() {
		loginButton.click();
	}
	
	public void verifyLoginError() {
		if(errorTextLogin.equals("Your email or password is incorrect!"));
	    {
	    	System.out.println("Login Unsuccessful. Incorrect credentails");
	    }
	}
	
	public void driverClose() {
	driver.close();
	}

	@Test
	public void invalidLoginToSite() throws InterruptedException {
		navigation();
		clickLoginSignupButton();
		verifyLoginText();
		setIncorrectLoginEmail();
		setIncorrectPassword();
		clickloginButton();
		verifyLoginError();
		driverClose();
	}

}
