package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/SelSoftware/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("btnLogin")).click();
		
	}

}
