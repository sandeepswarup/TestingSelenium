package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActXpathDemo 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/SelSoftware/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@class='initial']")).click();
		/*
		 * Thread.sleep(10000); driver.close();
		 */
	}

}
