package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import DriverPackage.DriverInit;
import DriverPackage.Util;
import Pages.Login;

public class TestLogin extends DriverInit {

	WebDriver driver;
	Util util;
	Login login;
	
	public TestLogin() {
		driver= init();
		util = new Util(driver);
		login = new Login(driver);
		
	}
	
	@Test
	public void TestingLoginFunctionality() throws InterruptedException {
		util.navigate("https://automationexercise.com");
		login.login();
		util.driverClose();
	}
	
}
