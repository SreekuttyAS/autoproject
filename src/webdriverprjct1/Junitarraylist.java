package webdriverprjct1;



import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitarraylist {
	ChromeDriver driver = new ChromeDriver();
	@Before
	public void array1()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/events/greatindianfestival/&ref_=ine_gw_j23_swm/?_encoding=UTF8&ref_=nav_swm_swm_gd&pf_rd_p=166c1a9f-511b-4a3d-a6f1-fcde599beb4d&pf_rd_s=nav-sitewide-msg&pf_rd_t=4201&pf_rd_i=navbar-4201&pf_rd_m=A21TJRUUN4KGV&pf_rd_r=N1Q859FP4XZXBDBZYBJT");
	}
		
	@Test
	public void array2()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("count of links = "+li.size());
		
		for(WebElement no:li)
		{
			System.out.println(no.getAttribute("href"));
		}
		
	}
	@After
	public void array3()
	{
		
	}
	
	
	

}
