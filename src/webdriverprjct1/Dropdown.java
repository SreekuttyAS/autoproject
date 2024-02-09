package webdriverprjct1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	ChromeDriver driver = new ChromeDriver();
	@Before
	public  void dropdown1()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		}
	@Test
	public  <Webelement> void dropdown2()
	{
		WebElement day=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select dayelement=new Select(day);
		dayelement.selectByValue("07");
		WebElement month=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select monthelement=new Select(month);
		monthelement.selectByVisibleText("JUN");
		WebElement year=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select yearelement=new Select(year);
		yearelement.selectByValue("2016");
		
	}
	@After
	public void dropdown3()
	{
		
	}
	
	

}
