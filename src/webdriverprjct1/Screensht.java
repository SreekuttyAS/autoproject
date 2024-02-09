package webdriverprjct1;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screensht {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void scrnsht()
	{
		driver.get("file:///C:/Users/Sreekutty/Desktop/alert_example.html");
	}
	@Test
	public void scrensht() throws IOException 
	{
		TakesScreenshot src=(TakesScreenshot)driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy((File) src, new File("C:\\Users\\Sreekutty\\Pictures\\Screenshots"));
	
		
		
	}

}
