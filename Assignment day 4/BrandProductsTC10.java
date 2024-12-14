package AssignmentDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DriverInit.DriverStart;

public class BrandProductsTC10 {

	WebDriver driver;
	public BrandProductsTC10(WebDriver driver) {
        this.driver = driver;
	}
	
	BrandProductsTC10(){
		DriverStart obj= new DriverStart();
		driver= obj.init();
		PageFactory.initElements(driver, this);	
	}	
	
	WebElement productButton= driver.findElement(By.xpath("//a[@href=\"/products\"]")); 
	WebElement featuresItemsText= driver.findElement(By.xpath("//h2[contains(text(),'Features Items')]")); 
	WebElement brandsTitle= driver.findElement(By.xpath("//h2[contains(text(), 'Brands')]"));
	WebElement brandPolo= driver.findElement(By.xpath("//a[@href=\"/brand_products/Polo\"]"));
	WebElement brandPoloTitle= driver.findElement(By.xpath("//h2[@class=\"title text-center\"]"));
	
	
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
	public void verifyBrands() {
		if(brandsTitle.equals("Brands"))
		{
			System.out.println("User has entered Brands Box");
		}
	}
	public void clickBrandCategory() {
		brandPolo.click();
		String actualUrl="https://automationexercise.com/brand_products/Polo";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	public void verifyBrandPoloProducts() {
		if(brandPoloTitle.equals("Brand - Polo Products"))
		{
			System.out.println("User has entered Polo Brand Page");
		}
	}
	
	public void driverClose() {
		driver.close();
	}
		
		@Test
		public void scrollUpFunctionality() throws InterruptedException {
			navigation();
			verifyHomepage();
			clickProductsButton();
			verifyBrands();
			clickBrandCategory();
			verifyBrandPoloProducts();
			driverClose();
	
		}
}
