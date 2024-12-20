package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import DriverInit.DriverInit;
import DriverPackage.Util;
import Pages.Signup;

public class TestSignup extends DriverInit{
	
	WebDriver driver;
	Util util;
	Signup signup;
	
	public TestSignup() {
		driver = init();
		util = new Util(driver);
		signup = new Signup(driver);
	}
	
	@Test
	public void signupFunctionality() throws InterruptedException {
		util.navigate("https://automationexercise.com");
		signup.signup();
		util.driverClose();
	}

}
