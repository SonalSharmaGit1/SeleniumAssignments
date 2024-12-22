package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import DriverInit.DriverInit;
import DriverPackage.Util;
import Pages.AddCart;

public class TestAddCart extends DriverInit{
	WebDriver driver;
	Util util;
	AddCart addCart;
	
	public TestAddCart() {
		driver = init();
		util = new Util(driver);
		addCart = new AddCart(driver);
	}
	
	@Test
	public void addCartFunctionality() throws InterruptedException {
		util.navigate("https://automationexercise.com");
		addCart.addCart();
		util.driverClose();
	}

}
