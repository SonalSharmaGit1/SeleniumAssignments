package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import DriverInit.DriverInit;

public class AddCart extends DriverInit {

WebDriver driver;
	
	public AddCart(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h2[contains(text(),'website for Automation Engineers')]")
	WebElement automationText;
	@FindBy(xpath="//a[@href=\"/products\"]")
	WebElement productButton;
	@FindBy(xpath="(//div[@class='productinfo text-center'][1]/a)[1]")
	WebElement AddtocartProduct1;
	@FindBy(xpath="//button[contains(text(),'Continue Shopping')]")
	WebElement continueButton;
	@FindBy(xpath="//div[@class=\"product-overlay\"])[2]/div/a")
	WebElement addToCartOverlayButtonProduct2;
	@FindBy(xpath="//div[@class=\"modal-content\"]/div[2]/p[2]/a[@href=\"/view_cart\"]")
	WebElement modalViewCart;
	@FindBy(xpath="//tr[@id=\"product-1\"]/td[2]/h4/a")
	WebElement cartProduct1;
	@FindBy(xpath="//tr[@id=\"product-2\"]/td[2]/h4/a")
	WebElement cartProduct2;
	@FindBy(xpath="//tr[@id=\"product-1\"]/td[3]/p")
	WebElement cartProduct1Price;
	@FindBy(xpath="//tr[@id=\"product-2\"]/td[3]/p")
	WebElement cartProduct2Price;
	@FindBy(xpath="//tr[@id='product-1']/td[4]/button")
	WebElement quantityProduct1;
	@FindBy(xpath="//tr[@id='product-2']/td[4]/button")
	WebElement quantityProduct2;
	@FindBy(xpath="//tr[@id=\"product-1\"]/td[5]/p")
	WebElement totalPriceProduct1;
	@FindBy(xpath="//tr[@id=\"product-2\"]/td[5]/p")
	WebElement totalPriceProduct2;
//	@FindBy(xpath="")
//	WebElement ;
//	@FindBy(xpath="")
//	WebElement ;
//	
	
	public void addCart() throws InterruptedException {
		verifyHomepage();
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
		
	}
	
	public void verifyHomepage() {
		if(automationText.equals("website for Automation Engineers"))
		{
			System.out.println("User has entered Homepage");
		}
	}	
	public void clickProductsButton() {
		productButton.click();
		String actualUrl="https://automationexercise.com/products";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	public void addProduct1() throws InterruptedException {
		AddtocartProduct1.click();
		Thread.sleep(1000);
	}
	public void continueButton() {
		continueButton.click();
	}
	public void addProduct2() throws InterruptedException {
		addToCartOverlayButtonProduct2.click();
		Thread.sleep(1000);
	}
	public void viewCart() throws InterruptedException {
		modalViewCart.click();
		String actualUrl="https://automationexercise.com/view_cart";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		Thread.sleep(1000);
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
}
