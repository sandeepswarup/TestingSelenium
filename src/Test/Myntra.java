package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/SelSoftware/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com");
		//WebElement link=driver.findElement(By.linkText("essentials"));
		//System.out.println(link.getText());
	driver.findElement(By.linkText("Essentials")).click();
	
	}
}
