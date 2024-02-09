package webdriverprjct1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatingstrategies1 {
	ChromeDriver driver;
	@Before
	
	public void locate()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	
	public void locate2()
	{ 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ab@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
	}
	
	@After
	
	public void locate3()
	{
		
	}

}
