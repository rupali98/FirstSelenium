package testing_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex14_HandleButton
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
	
  @Test
  public void f() throws InterruptedException
  {
	  driver = new ChromeDriver();
	  driver.get(url);
	  
	  Thread.sleep(1000);
	  
//	  Xpath
	  
	  WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
	  loginButton.click();
	  
//	 
	 /* cssSelector
	  WebElement loginButton = driver.findElement(By.cssSelector("input[value='LoginIn'"));
	  loginButton.click();
	  */
	 
	  
	  Thread.sleep(1000);
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
