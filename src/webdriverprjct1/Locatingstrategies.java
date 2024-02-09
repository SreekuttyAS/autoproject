package webdriverprjct1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatingstrategies {

	ChromeDriver driver;
	@Before
	
	public void locate()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}
	
	@Test
	
	public void locate2()
	{ 
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc@123");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	
	public void locate3()
	{
		
	}
	
}
