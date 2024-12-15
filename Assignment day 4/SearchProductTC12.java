package AssignmentDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DriverInit.DriverStart;

public class SearchProductTC12 {

WebDriver driver;
	
	public SearchProductTC12(WebDriver driver) {
        this.driver = driver;
	}
	

	SearchProductTC12(){
		DriverStart obj= new DriverStart();
		driver= obj.init();
		PageFactory.initElements(driver, this);	
	}	
	
	WebElement productButton= driver.findElement(By.xpath("//a[@href=\"/products\"]")); 
	WebElement featuresItemsText= driver.findElement(By.xpath("//h2[contains(text(),'Features Items')]")); 
	WebElement allProductsText= driver.findElement(By.xpath("//h2[contains(text(),'All Products')]"));
	WebElement searchProductText = driver.findElement(By.xpath("//input[@id='search_product']"));
	WebElement searchIcon = driver.findElement(By.xpath("//i[@class=\"fa fa-search\"]"));
	WebElement searchedProductsTitle= driver.findElement(By.xpath("//h2[contains(text(), 'Searched Products')]"));
	WebElement searchedProducts= driver.findElement(By.xpath("//p[contains(text(), 'Saree')]"));
	
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
	public void setSearchText() {
		searchProductText.sendKeys("ABCDEF");
	}
	public void clickSearchIcon() {
		searchIcon.click();
	}
	public void verifySearchedProductsTitle() {
		if(searchedProductsTitle.equals("Searched products"))
		{
			System.out.println("All searched products are visible for the user");
		}
	}
	public void verifySearchedProducts() {
		if(searchedProducts.equals("Saree"))
		{
			System.out.println("All search results for the keyword 'saree' are populated");
		}
	}
	public void driverClose() {
		driver.close();
	}
	
	
	@Test
	public void searchProduct() throws InterruptedException {
		navigation();
		verifyHomepage();
		clickProductsButton();
		verifyAllProducts();
		setSearchText();
		clickSearchIcon();
		verifySearchedProductsTitle();
		verifySearchedProducts();
		driverClose();
	
	}
	
}
