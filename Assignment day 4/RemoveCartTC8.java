package AssignmentDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DriverInit.DriverStart;

public class RemoveCartTC8 {

	WebDriver driver;
	public RemoveCartTC8(WebDriver driver) {
        this.driver = driver;
	}
	
	RemoveCartTC8(){
		DriverStart obj= new DriverStart();
		driver= obj.init();
		PageFactory.initElements(driver, this);	
	}	
	
	WebElement productButton= driver.findElement(By.xpath("//a[@href=\"/products\"]")); 
	WebElement AddtocartProduct1= driver.findElement(By.xpath("(//div[@class='productinfo text-center'][1]/a)[1]"));
	WebElement continueButton= driver.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]"));
	WebElement addToCartOverlayButtonProduct2= driver.findElement(By.xpath("(//div[@class=\"product-overlay\"])[2]/div/a"));
	WebElement modalViewCart= driver.findElement(By.xpath("//div[@class=\"modal-content\"]/div[2]/p[2]/a[@href=\"/view_cart\"]"));
	WebElement cartProduct1= driver.findElement(By.xpath("//tr[@id=\"product-1\"]/td[2]/h4/a"));
	WebElement cartProduct2= driver.findElement(By.xpath("//tr[@id=\"product-2\"]/td[2]/h4/a"));
	WebElement cartProduct1Price= driver.findElement(By.xpath("//tr[@id=\"product-1\"]/td[3]/p"));
	WebElement cartProduct2Price= driver.findElement(By.xpath("//tr[@id=\"product-2\"]/td[3]/p"));
	WebElement quantityProduct1= driver.findElement(By.xpath("WebElement = driver.findElement(By.xpath(\"\"));"));
	WebElement quantityProduct2= driver.findElement(By.xpath("//tr[@id=\"product-2\"]/td[4]/button"));
	WebElement totalPriceProduct1= driver.findElement(By.xpath("//tr[@id=\"product-1\"]/td[5]/p"));
	WebElement totalPriceProduct2= driver.findElement(By.xpath("//tr[@id=\"product-2\"]/td[5]/p"));
	WebElement cartDeleteP1= driver.findElement(By.xpath("//a[@class=\"cart_quantity_delete\"and @data-product-id=\"1\"]"));
	WebElement cartDeleteP2= driver.findElement(By.xpath("//a[@class=\"cart_quantity_delete\"and @data-product-id=\"2\"]"));
	
	public void navigation() throws InterruptedException {
		driver.get("https://automationexercise.com/category_products/6");
	}
	
	public void clickProductsButton() {
		productButton.click();
	}
	public void addProduct1() {
		AddtocartProduct1.click();
	}
	public void continueButton() {
		continueButton.click();
	}
	public void addProduct2() {
		addToCartOverlayButtonProduct2.click();
	}
	public void viewCart() {
		modalViewCart.click();
	}
	public void verifyProduct1InCart() {
		if(cartProduct1.equals("Blue Top"))
		{
			System.out.println("User has entered correct Product 1 in cart");
		}
	}
	public void verifyProduct2InCart() {
		if(cartProduct2.equals("BMen Tshirt"))
		{
			System.out.println("User has entered correct Product 2 in cart");
		}
	}
	public void verifyPrice1InCart() {
		if(cartProduct1Price.equals("500"))
		{
			System.out.println("Correct amount displayed for product 1");
		}
	}
	public void verifyPrice2InCart() {
		if(cartProduct2Price.equals("400"))
		{
			System.out.println("Correct amount displayed for product 2");
		}
	}
	public void verifyQuantityP1InCart() {
		if(quantityProduct1.equals("1"))
		{
			System.out.println("Correct quantity displayed for product 1");
		}
	}
	public void verifyQuantityP2InCart() {
		if(quantityProduct2.equals("1"))
		{
			System.out.println("Correct quantity displayed for product 2");
		}
	}
	public void verifyTotalPriceP1() {
		if(totalPriceProduct1.equals("500"))
		{
			System.out.println("Correct total price displayed for product 1");
		}
	}
	public void verifyTotalPriceP2() {
		if(totalPriceProduct2.equals("400"))
		{
			System.out.println("Correct total price displayed for product 2");
		}
	}
	public void deleteItemP1() {
		cartDeleteP1.click();
	}
	public void deleteItemP2() {
		cartDeleteP2.click();
	}
	public void driverClose() {
		driver.close();
	}
	
	@Test
	public void addToCart() throws InterruptedException {
		navigation();
		clickProductsButton();
		addProduct1();
		continueButton();
		addProduct2();
		viewCart();
		verifyProduct1InCart();
		verifyProduct2InCart();
		verifyPrice1InCart();
		verifyPrice2InCart();
		verifyQuantityP1InCart();
		verifyQuantityP2InCart();
		verifyTotalPriceP1();
		verifyTotalPriceP2();
		deleteItemP1();
		deleteItemP2();
		driverClose();
	}
	
}
