package AssignmentDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DriverInit.DriverStart;

public class AddingReviewTC15 {

WebDriver driver;
	
	public AddingReviewTC15(WebDriver driver) {
        this.driver = driver;
	}
	

	AddingReviewTC15(){
		DriverStart obj= new DriverStart();
		driver= obj.init();
		PageFactory.initElements(driver, this);	
	}	
	
	WebElement productButton= driver.findElement(By.xpath("//a[@href=\"/products\"]")); 
	WebElement featuresItemsText= driver.findElement(By.xpath("//h2[contains(text(),'Features Items')]")); 
	WebElement allProductsText= driver.findElement(By.xpath("//h2[contains(text(),'All Products')]"));
	WebElement ViewProduct1= driver.findElement(By.xpath("//a[@href='/product_details/1']"));
	WebElement reviewBox= driver.findElement(By.xpath("//a[contains(text(),'Review')]"));
	WebElement nameTextbox= driver.findElement(By.xpath("//input[@id=\"name\"]"));
	WebElement emailTextbox= driver.findElement(By.xpath("//input[@id=\"email\"]"));
	WebElement reviewTextbox= driver.findElement(By.xpath("//textarea[@id=\"review\"]"));
	WebElement submitButton= driver.findElement(By.xpath("//button[@id=\"button-review\"]"));
	WebElement thankYouText= driver.findElement(By.xpath("//span[contains(text(),'Thank you for your review.')]"));
	
	
	public void navigation() throws InterruptedException {
		driver.get("https://automationexercise.com/category_products/6");
	}
	
	public void verifyHomepage() {
		if(featuresItemsText.equals("Features Items"))
		{
			System.out.println("User has entered Homepage");
		}
	}
	
	public void clickProductsButton() {
		productButton.click();
	}
	public void verifyAllProducts() {
		if(allProductsText.equals("All Products"))
		{
			System.out.println("User has entered Products Box");
		}
	}
	public void view1stProduct() {
		ViewProduct1.click();
	}
	public void verifyWriteYourReview() {
		if(reviewBox.equals("Write Your Review")) {
			System.out.println("User has entered review box for the product");
		}
		String actualUrl="https://automationexercise.com/product_details/1";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
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
	public void driverClose() {
		driver.close();
	}
	
	@Test
	public void verifyproductsPage() throws InterruptedException {
		navigation();
		verifyHomepage();
		clickProductsButton();
		verifyAllProducts();
		view1stProduct();
		verifyWriteYourReview();
		setName();
		setEmail();
		setReviewText();
		clickSubmitReview();
		verifySuccessText();
		driverClose();
	}
}
