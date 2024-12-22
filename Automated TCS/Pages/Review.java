package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import DriverInit.DriverInit;

public class Review extends DriverInit{
	
	WebDriver driver;
	
	public Review(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h2[contains(text(),'website for Automation Engineers')]")
	WebElement automationText;
	@FindBy(xpath="//a[@href=\"/products\"]")
	WebElement productButton;
	@FindBy(xpath="//h2[contains(text(),'All Products')]")
	WebElement allProductsText;
	@FindBy(xpath="//a[@href='/product_details/1']")
	WebElement ViewProduct1;
	@FindBy(xpath="//a[contains(text(),'Review')]")
	WebElement reviewBox;
	@FindBy(xpath="//input[@id=\"name\"]")
	WebElement nameTextbox;
	@FindBy(xpath="//input[@id=\"email\"]")
	WebElement emailTextbox;
	@FindBy(xpath="//textarea[@id=\"review\"]")
	WebElement reviewTextbox;
	@FindBy(xpath="//button[@id=\"button-review\"]")
	WebElement submitButton;
	@FindBy(xpath="//span[contains(text(),'Thank you for your review.')]")
	WebElement thankYouText;
		
	public void review() throws InterruptedException {
		verifyHomepage();
		clickProductsButton();
		clickProductsButton();
		verifyAllProducts();
		view1stProduct();
		verifyWriteYourReview();
		setName();
		setEmail();
		setReviewText();
		clickSubmitReview();
		verifySuccessText();
		
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

	public void verifyAllProducts() {
		if(allProductsText.equals("All Products"))
		{
			System.out.println("User has entered Products Box");
		}
	}
	public void view1stProduct() {
		ViewProduct1.click();
		String actualUrl="https://automationexercise.com/product_details/1"; 
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	public void verifyWriteYourReview() {
		if(reviewBox.equals("Write Your Review")) {
			System.out.println("User has entered review box for the product");
		}
	}
	public void setName() {
		nameTextbox.sendKeys("ABC");
	}
	public void setEmail() {
		emailTextbox.sendKeys("152@gmail.com");
	}
	public void setReviewText() {
		reviewTextbox.sendKeys("Hey there testing review");
	}
	public void clickSubmitReview() {
	submitButton.click();
	}
	public void verifySuccessText() {
	if(thankYouText.equals("Thank you for your review.")) {
		System.out.println("User has successfully entered a review");
		}
	}

}
