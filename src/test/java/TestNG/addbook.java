package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addbook {
	 WebDriver driver;
	@BeforeMethod
	public void launch() {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.get("http://34.73.146.33:32768/addressbook/");
	}
  @Test
  public void verfiyaddbook() {
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("Selenium");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("edureka");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("9876543210");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("devops@gmail.com");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("06/11/1985");
  }
  
  @AfterMethod
  public void close() {
	 driver.close();
  }
}
