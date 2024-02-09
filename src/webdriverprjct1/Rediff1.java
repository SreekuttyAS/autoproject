package webdriverprjct1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff1 {
	ChromeDriver driver;
	@Before
	public void rediff()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void checkavailability()
	{
		WebElement btn=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
		String actual= btn.getAttribute("value");
		String expp="Check availability";
		if(actual.equals(expp))
			{
			System.out.println("pass");
			}
		else
		{
			System.out.println("fail");
		}
	
	
				
				}
	
@After

	public void redifff()
	{
		
	}
}
	
	
	


