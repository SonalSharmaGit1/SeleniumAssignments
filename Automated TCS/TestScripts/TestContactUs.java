package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import DriverInit.DriverInit;
import DriverPackage.Util;
import Pages.ContactUs;

public class TestContactUs extends DriverInit{

	WebDriver driver;
	Util util;
	ContactUs contactUs;
	
	public TestContactUs() {
		driver = init();
		util = new Util(driver);
		contactUs = new ContactUs(driver);
	}
	
	@Test
	public void contactUsFunctionality() throws InterruptedException {
		util.navigate("https://automationexercise.com");
		contactUs.contactUs();
		util.driverClose();
}
	
}
