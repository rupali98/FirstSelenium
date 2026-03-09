package Testng_other_operations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ex07_01_TestExecution 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
//		driver = new HtmlUnitDriver();
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(1000);
				
	}
  @Test
  public void f() 
  {
    WebElement aboutUsLink = driver.findElement(By.linkText("About Us"));
    aboutUsLink.click();
    System.out.println(driver.getTitle());
 
  }
  
  @Test
  public void test02() throws InterruptedException
  {
	  WebElement servicesLink = driver.findElement(By.linkText("Services"));
	  servicesLink.click();
	  System.out.println(driver.getTitle());
  }
  
  @AfterClass
  public void afterClass() throws InterruptedException
  {
	  Thread.sleep(1000);
	  driver.quit();
  }
  
  
  
  
  
  
  
  
  
}
