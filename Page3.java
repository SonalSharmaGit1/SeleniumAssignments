package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Page3 {
	
	@Test
	public void run()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonal\\eclipse-workspace\\Practice\\heyyyy\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
		
		//Cart Identification
		WebElement CartIcon= driver.findElement(By.xpath("//ul[@class= 'nav navbar-nav']/li[3]/a")); // Cart button on top by xPath
		WebElement product= driver.findElement(By.xpath("//a[@href=\"/products\"]")); // product button using xpath href
		WebElement contactUs= driver.findElement(By.xpath("(//ul[@class= 'nav navbar-nav'])/li[3]/following-sibling::li[5]/a"));// Contact us button on top by xpath
		WebElement VideoTutorial= driver.findElement(By.xpath("(//ul[@class= 'nav navbar-nav'])/li[3]/following-sibling::li[4]/a[1]")); //Video tutorial on top using xpath + following sibling
		WebElement HomeIcomcartPage= driver.findElement(By.xpath("(//a[contains(text(), 'Home') and @href=\"/\"])[2]"));
		WebElement ShoppingCartText= driver.findElement(By.xpath("//li[contains(text(), 'Shopping Cart')]"));
		WebElement checkoutButton= driver.findElement(By.xpath("//a[contains(text(),'Proceed To Checkout')]"));
		WebElement ItemColumn= driver.findElement(By.xpath("//td[contains(text(), 'Item')]"));
		WebElement PriceColumn= driver.findElement(By.xpath("//td[contains(text(), 'Item')]//following::td[2]"));
		WebElement WomenTopText= driver.findElement(By.xpath("//p[contains(text(),'Women > Tops')]"));
		WebElement BlueTopText = driver.findElement(By.xpath("//a[contains(text(),'Blue Top')]"));
		WebElement QuantityNumber= driver.findElement(By.xpath("//button[@fdprocessedid=\"nee2l4\"]"));
		WebElement ProdcutImage= driver.findElement(By.xpath("//img[@src=\"get_product_picture/1\"]"));
		WebElement CrossIcon= driver.findElement(By.xpath("//i[@class=\"fa fa-times\"]"));
		driver.close();
		
	}

}
