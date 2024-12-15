package AssignmentDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DriverInit.DriverStart;

public class ProductsPageTC11 {

WebDriver driver;
	
	public ProductsPageTC11(WebDriver driver) {
        this.driver = driver;
	}
	

	ProductsPageTC11(){
		DriverStart obj= new DriverStart();
		driver= obj.init();
		PageFactory.initElements(driver, this);	
	}	
	
	WebElement productButton= driver.findElement(By.xpath("//a[@href=\"/products\"]")); 
	WebElement featuresItemsText= driver.findElement(By.xpath("//h2[contains(text(),'Features Items')]")); 
	WebElement allProductsText= driver.findElement(By.xpath("//h2[contains(text(),'All Products')]"));
	WebElement ViewProduct1= driver.findElement(By.xpath("//a[@href='/product_details/1']"));
	WebElement reviewBox= driver.findElement(By.xpath("//a[contains(text(),'Review')]"));
	WebElement product1Name= driver.findElement(By.xpath("//h2[contains(text(),'Blue Top')]"));
	WebElement product1Category= driver.findElement(By.xpath("//p[contains(text(),'Category: Women > Tops')]"));
	WebElement product1Price= driver.findElement(By.xpath("//span[contains(text(),'Rs. 500')]"));
	WebElement product1AddToCart= driver.findElement(By.xpath("//button[@fdprocessedid=\"g69y08\"]"));
	WebElement product1Quantity= driver.findElement(By.xpath("//input[@id=\"quantity\"]"));
	WebElement product1Availability= driver.findElement(By.xpath("//p[contains(text(),'In Stock')]"));
	WebElement product1Condition= driver.findElement(By.xpath("//p[contains(text(),'New')]"));
	WebElement product1Brand= driver.findElement(By.xpath("//p[contains(text(),'Polo')]"));
	
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
	public void verifyproductPage() {
		if(reviewBox.equals("Write Your Review")) {
			System.out.println("User has entered view product page");
		}
		String actualUrl="https://automationexercise.com/product_details/1";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	public void verifyProductName() {
		if(product1Name.equals("Blue Top")) {
			System.out.println("User has opened Product 1(Women Blue Top)");
		}
	}
	public void verifyProductCategory() {
		if(product1Category.equals("Women > Tops")) {
			System.out.println("Product 1 category is Women > Tops");
		}
	}
	public void verifyProductPrice() {
		if(product1Price.equals("Rs. 500")) {
			System.out.println("Product 1 price is Rs. 500");
		}
	}
	public void verifyProductQuantity() {
		if(product1Quantity.equals("1")) {
			System.out.println("Product 1 quantity selected is 1");
		}
	}
	public void verifyProductAvailability() {
		if(product1Availability.equals("In Stock")) {
			System.out.println("Product 1 is in stock");
		}
	}
	public void verifyProductCondition() {
		if(product1Condition.equals("New")) {
			System.out.println("Product 1 is a new product");
		}
	}
	public void verifyProductBrand() {
		if(product1Brand.equals("Polo")) {
			System.out.println("Product 1 is of the brand Polo");
		}
	}
	public void verifyProductAddToCart() {
		product1AddToCart.click();
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
		verifyproductPage();
		verifyProductName();
		verifyProductCategory();
		verifyProductPrice();
		verifyProductQuantity();
		verifyProductAvailability();
		verifyProductCondition();
		verifyProductBrand();
		verifyProductAddToCart();
		driverClose();
	}
	
	
	
	
	
	
	
	
}
