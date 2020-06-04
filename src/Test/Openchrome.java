package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome {

	public static void main(String[] args) 
	{
		
System.setProperty("webdriver.chrome.driver", "E:/SelSoftware/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.navigate().to("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.name("remember")).click();
driver.findElement(By.name("loginButton")).click();
	}

}
