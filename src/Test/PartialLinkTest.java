package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:/SelSoftware/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		WebElement link= driver.findElement(By.partialLinkText("For"));
		System.out.println(link.getText());
		driver.close();
		driver.quit();
	}

}
