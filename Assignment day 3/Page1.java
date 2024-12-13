package AssignmentDay3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DriverInit.DriverStart;

public class Page1 {

	WebDriver driver;
	Page1(){
		DriverStart obj= new DriverStart();
		driver= obj.init();
		PageFactory.initElements(driver, this);
		
	}	
		//Login and signUp Identification
		WebElement emailLogin=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")); //login email
		WebElement passwordLogin=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")); //login password
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Login')]")); //Login button
		WebElement nameSignup=driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")); // SignUp name
		WebElement emailSignUp=driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")); //SignUp email
		WebElement signupButton=driver.findElement(By.xpath("//button[contains(text(),'Signup')]")); //SignUp button
		WebElement subscriptionEmail= driver.findElement(By.id("susbscribe_email")); //subscription email address
		WebElement SignupLoginButton= driver.findElement(By.linkText("/login")); // SignUp/login button on top by linkText
		
		//String Identification
		String LoginString1 =driver.findElement(By.tagName("h2")).getText(); //Login String by tagName and getText()
		{if(LoginString1.equals("Login to your account"))
			{
			 System.out.println("TC Passed");
			}
		}
		WebElement LoginString2= driver.findElement(By.xpath("//h2[contains(text(),'Login to your account')]")); //Login String by xPath
		WebElement ORString1= driver.findElement(By.xpath("//h2[contains(text(),\"OR\")]")); // OR String by xPath
		WebElement ORString2= driver.findElement(By.className("or")); // OR String by className
		WebElement SignupString1= driver.findElement(By.xpath("//h2[contains(text(),'New User Signup!')]")); //SignUp String by xPath
		WebElement copyrightString= driver.findElement(By.className("pull-left")); // copyright string by className
		
		
		
		public void navigation() throws InterruptedException {
			driver.get("https://automationexercise.com/category_products/6");
		}
		
		public void setLoginEmail(){
			emailLogin.sendKeys("abc@gmail.com");
			
		}
		
		public void setPassword() {
			passwordLogin.sendKeys("123qqqWWW");
			
		}
		
		public void clickloginButton() {
			loginButton.click();
		}
		
		public void driverClose() {
		driver.close();
		}

		@Test
		public void loginToSite() throws InterruptedException {
			navigation();
			setLoginEmail();
			setPassword();
			clickloginButton();
			driverClose();
		}
		
	
}
