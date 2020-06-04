package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLoginDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:/SelSoftware/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		  driver.get("https://login.yahoo.com/config/login");
			driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("samirbehera6@yahoo.in");
			driver.findElement(By.xpath("//input[@id='login-signin']")).click();
			driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("jkjhjjhg");
			driver.findElement(By.xpath("//button[@id='login-signin']")).click();

	}

}
