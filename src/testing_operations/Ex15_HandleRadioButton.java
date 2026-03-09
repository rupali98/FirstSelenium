package testing_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex15_HandleRadioButton 
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
	  
	  WebElement adminPageLink = driver.findElement(By.linkText("Admin Page"));
	  adminPageLink.click();
	  
	  Thread.sleep(1000);
	  
//	  REST XML
	  
	  WebElement restRadioButton = driver.findElement(By.id("accessMode2"));
	  restRadioButton.click();
	  
	  System.out.println(restRadioButton.isSelected());
	  
	  Thread.sleep(1000);
	  
	  driver.quit();
	  
	  
  }
}
