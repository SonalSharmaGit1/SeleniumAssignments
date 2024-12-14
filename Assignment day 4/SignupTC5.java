package AssignmentDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DriverInit.DriverStart;

public class SignupTC5 {

	WebDriver driver;
	public SignupTC5(WebDriver driver) {
        this.driver = driver;
	}
	
	SignupTC5(){
		DriverStart obj= new DriverStart();
		driver= obj.init();
		PageFactory.initElements(driver, this);	
	}	

	WebElement SignupLogin= driver.findElement(By.linkText("/login"));//signup-login button
	WebElement SignupString= driver.findElement(By.xpath("//h2[contains(text(),'New User Signup!')]"));
	WebElement nameSignup=driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")); // SignUp name
	WebElement emailSignUp=driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")); //SignUp email
	WebElement signupButton=driver.findElement(By.xpath("//button[contains(text(),'Signup')]")); //SignUp button
	WebElement signupError= driver.findElement(By.xpath("//p[contains(text(),'Email Address already exist!')]"));
	
	public void navigation() throws InterruptedException {
		driver.get("https://automationexercise.com/category_products/6");
	}
	public void clickLoginSignupButton() {
		SignupLogin.click();
	}
	public void verifySignupText()
	{
		if(SignupString.equals("New user Signup!"))
		{
			System.out.println("User has entered Signup box");
		}
	}
	public void setSignupName() {
		nameSignup.sendKeys("Sonal@12345");
		
	}
	public void setSignupUsedEmail(){
		emailSignUp.sendKeys("sonalssharma06@gmail.com");
		
	}
	public void clickSignupButton() {
		signupButton.click();
	}
	public void errorSignup() {
		if(signupError.equals("Email Address already exist!"))
		{
			System.out.println("User has entered already used email address");
		}
	}
	
	public void driverClose() {
		driver.close();
	}
	
	@Test
	public void signupWithExistingEmail() throws InterruptedException {
		navigation();
		clickLoginSignupButton();
		verifySignupText();
		setSignupName();
		setSignupUsedEmail();
		clickSignupButton();
		errorSignup();
		driverClose();
		
	}
}


	

