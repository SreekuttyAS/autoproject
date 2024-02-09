package webdriverprjct1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerteg {
	ChromeDriver driver =new  ChromeDriver();
	@Before
	public void alert()
	{
		driver.get("file:///C:/Users/Sreekutty/Desktop/alert_example.html");
	}
	@Test
	public void alert1()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		org.openqa.selenium.Alert a= driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("def");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}
	@After
	public void alert2()
	{
		
	}

}
