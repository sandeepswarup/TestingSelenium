package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmericamAirline {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:/SelSoftware/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
	        WebElement searchcity=driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
	        searchcity.sendKeys("san");
	        //WebElement searchcitysan=driver.findElement(By.xpath("//a[@id='ui-id-24']"));
	        WebDriverWait wait=new WebDriverWait(driver, 15);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-24']")));
	        List<WebElement>city=driver.findElements(By.xpath("(//li[@role='presentation'])[6]"));
	        city.get(6).click();

	}

}
