package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentQS {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:/SelSoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qspiders.com/contact");
	WebElement contact= driver.findElement(By.xpath("//a[.='Qspiders Us']/../../..//div[.='+1 (415) 429-3957'])"));
	Thread.sleep(5000);
	System.out.println(contact.getAttribute(null));
		

	}

}
