package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:/SelSoftware/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement link= driver.findElement(By.linkText("Forgotten account?"));
		System.out.println(link.getText());
		link.click();
	}

}
