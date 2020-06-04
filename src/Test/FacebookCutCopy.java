package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCutCopy {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:/SelSoftware/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	        WebElement username= driver.findElement(By.xpath("//input[@name='firstname']"));
	        username.sendKeys("suraj");
	        //username.sendKeys(Keys.CONTROL,"a");
	        for(int i=1;i<=3;i++) 
	        {
	        
	        username.sendKeys(Keys.BACK_SPACE);	
	       }
	        username.sendKeys("RAJ");
	        username.sendKeys(Keys.CONTROL,"a");
	        username.sendKeys(Keys.DELETE);
	        username.sendKeys("suraj");
	        username.sendKeys(Keys.CONTROL,"a");
	        username.sendKeys(Keys.DELETE);
	        username.sendKeys("SURAJ");
	        username.sendKeys(Keys.CONTROL,"a");
	        username.sendKeys(Keys.DELETE);
	        username.sendKeys("suraj");
	}

}
