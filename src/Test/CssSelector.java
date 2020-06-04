package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/SelSoftware/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("8908055775");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("RimiMudra");
		driver.findElement(By.cssSelector("input[data-testid='royal_login_button']")).click();

		

	}

}
