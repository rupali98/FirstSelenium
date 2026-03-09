package testing_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex09_HandleElementLocators_Way1 
{

  
  WebDriver driver;
  String projectPath = System.getProperty("user.dir");
  String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
  String url = "https://parabank.parasoft.com/parabank/index.htm";
  
  @Test
  public void f() throws Exception
  {
	  driver = new ChromeDriver();
	  driver.get(url);
	  
	  Thread.sleep(1000);
	  
//	  Link Text
	  driver.findElement(By.linkText("About Us")).click();
	  Thread.sleep(1000);
	  
//	  PartialLinkText
	  driver.findElement(By.partialLinkText("Ser")).click();
	  Thread.sleep(1000);
	  
//	  Link Text
	  driver.findElement(By.linkText("Register")).click();
	  Thread.sleep(1000);
	  
//	  Name 
	  driver.findElement(By.name("customer.firstName")).sendKeys("John");
	  Thread.sleep(1000);
	  
//	  ID
	  driver.findElement(By.id("customer.lastName")).sendKeys("Adam");
	  Thread.sleep(1000);
	  
	  driver.quit();
  }
}
