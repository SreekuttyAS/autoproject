package webdriverprjct1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitproj1 {
	ChromeDriver driver;
	@Before
	
	
	
	public void basic()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.luminartechnolab.com/");
		
	}
	@Test
	
	public void basic2()
	{
		String title=driver.getTitle();
		String title2="lumi";
		if(title.equals(title2))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	}
	@After
	
	public void basic3()
	{
		driver.quit();
	}
	
	

}
