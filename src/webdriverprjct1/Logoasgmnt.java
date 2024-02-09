package webdriverprjct1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoasgmnt {
	ChromeDriver driver;
	@Before
	public void page()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void logo()
	{
		WebElement logop=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		if (logop.isDisplayed())
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
	}
	@After
	public void done()
	{
		
	}

}
