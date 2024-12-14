package AssignmentDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DriverInit.DriverStart;

public class ScrollUpTC9 {
	
	WebDriver driver;
	public ScrollUpTC9(WebDriver driver) {
        this.driver = driver;
	}
	
	ScrollUpTC9(){
		DriverStart obj= new DriverStart();
		driver= obj.init();
		PageFactory.initElements(driver, this);	
	}	
	
	WebElement productButton= driver.findElement(By.xpath("//a[@href=\"/products\"]")); 
	WebElement featuresItemsText= driver.findElement(By.xpath("//h2[contains(text(),'Features Items')]")); 
	WebElement subscriptionText=driver.findElement(By.xpath("//h2[contains(text(),'Subscription')]"));
	WebElement scrollUpArrow= driver.findElement(By.xpath("//a[@id='scrollUp' and @href='#top']"));
	WebElement automationText= driver.findElement(By.xpath("//h2[contains(text(),'website for Automation Engineers')]"));
	
	
	public void navigation() throws InterruptedException {
		driver.get("https://automationexercise.com/category_products/6");
	}
	
	public void verifyHomepage() {
		if(featuresItemsText.equals("Features Items"))
		{
			System.out.println("User has entered Homepage");
		}
	}
	
	public void scrollDown() {
		if(subscriptionText.equals("Subscription"))
		{
			System.out.println("User has scrolled down to the botton of the page");
		}
	}
	public void clickScrollUpArrow() {
		scrollUpArrow.click();
	}
		
	public void verifyPageScrolledUp() {
		if(automationText.equals("website for Automation Engineers"))
		{
			System.out.println("User has scrolled up to the top of the page");
		}
	}
		public void driverClose() {
			driver.close();
		}
		
		@Test
		public void scrollUpFunctionality() throws InterruptedException {
			navigation();
			verifyHomepage();
			scrollDown();
			clickScrollUpArrow();
			verifyPageScrolledUp();
			driverClose();
	
		}
	
}
