package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import DriverInit.DriverInit;
import DriverPackage.Util;
import Pages.Review;

public class TestReview extends DriverInit{
	
	WebDriver driver;
	Util util;
	Review review;
	
	public TestReview() {
		driver = init();
		util = new Util(driver);
		review = new Review(driver);
	}
	
	@Test
	public void reviewAddFunctionality() throws InterruptedException {
		util.navigate("https://automationexercise.com");
		review.review();
		util.driverClose();
	}

}
