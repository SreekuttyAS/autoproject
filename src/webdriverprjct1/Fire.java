package webdriverprjct1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire {

	public static void main(String[] args) {
	    FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.flipkart.com/");
	    
	    String expectedtitle = driver.getTitle();
	    System.out.println(expectedtitle);
	    String actualtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	    if(expectedtitle.equals(actualtitle))
	    {
	    	System.out.println("pass");
	    }
	    else
	    {
	    	System.out.println("fail");
	    }
	  
	}

}
