package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import DriverInit.DriverInit;
import DriverPackage.Util;
import Pages.Logout;

public class TestLogout extends DriverInit {
	
	WebDriver driver;
	Util util;
	Logout logout;
	
	public TestLogout() {
		driver = init();
		util = new Util(driver);
		logout = new Logout(driver);
	}
	
	@Test
	public void LogoutFunctionality() throws InterruptedException {
		util.navigate("https://automationexercise.com");
		logout.logout();
		util.driverClose();
	}
}
