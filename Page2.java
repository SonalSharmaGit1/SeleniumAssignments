package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page2 {
	
	public void run()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\eclipse-workspace\\Practice\\heyyyy\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
		
		//HomePage Identification
		WebElement HomeHref= driver.findElement(By.linkText("/")); // Home button on top by linkText (not unique)
		WebElement HomeXpath= driver.findElement(By.xpath("//a[@href='/'])[2]"));// Home button on top by xPath-indexing (uniquely)
		WebElement Addtocart1= driver.findElement(By.xpath("(//div[@class='productinfo text-center'])[1]/a")); //product1 AddToCart by xPath indexing
		WebElement ViewProduct1= driver.findElement(By.xpath("//a[@href='/product_details/1']")); // product 1 ViewProduct by xPath indexing
		WebElement ItemPrice1 =driver.findElement(By.xpath("(//h2[contains(text(), 'Rs. 500')])[1]")); //ItemPrice1 by xPath indexing
		WebElement FeatureTitle= driver.findElement(By.xpath("//h2[@class='title text-center' and contains(text(), 'Features Items')]")); //FeatureTitle by xPath contains() + and attribute
		WebElement RecommendedTitle= driver.findElement(By.xpath("//h2[@class='title text-center' and contains(text(), 'recommended items')]"));
		WebElement UpwardArrow= driver.findElement(By.xpath("//a[@id='scrollUp' and @href='#top']")); // upward arrow using xPath id + and
		WebElement CategoryTitle= driver.findElement(By.xpath("//h2[contains(text(), 'Category')]")); //CategoryTitle using xPath contains()
		WebElement BrandsTitle= driver.findElement(By.xpath("//h2[contains(text(), 'Brands')]"));//BrandTitle using xPath contains()
		WebElement WomenCategory= driver.findElement(By.xpath("//div[@id='accordian']/div[1]")); //WomenCategory using xPath indexing parent to child
		WebElement Kidscategory= driver.findElement(By.xpath("//div[@id='accordian']/div[1]/following-sibling::div[2]"));//KidsCategory using following sibling from above
		WebElement BrandPolo= driver.findElement(By.xpath("//a[@href=\"/brand_products/Polo\"]")); 
		WebElement BrandPoloQuantity= driver.findElement(By.xpath("//span[@class = 'pull-right' and contains(text(), '6')]"));
		WebElement DataToggleWomen= driver.findElement(By.xpath("//span[@class= 'badge pull-right'][1]"));
		WebElement DressWomen= driver.findElement(By.xpath("//a[@href=\"/category_products/1\"]"));
		WebElement ToppsWomen= driver.findElement(By.xpath("//a[@href=\"/category_products/2\"]"));
		WebElement RightArrowRecommended= driver.findElement(By.xpath("//a[@class='right recommended-item-control']"));
		WebElement LeftArrowRecommended = driver.findElement(By.xpath("//a[@class='left recommended-item-control']"));
		WebElement AdvertisementBanner2 = driver.findElement(By.xpath("//div[@id='survey_page']"));
		
		
		driver.close();

}

}
