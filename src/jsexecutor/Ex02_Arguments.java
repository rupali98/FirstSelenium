package jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex02_Arguments 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.html";
	
  @Test
  public void f() throws InterruptedException
  {
	  driver = new ChromeDriver();
	  driver.get(url);
	  
	  Thread.sleep(2000);
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  
	  WebElement usernameTextBox = driver.findElement(By.xpath("//*[@name='username']"));
	  
	  js.executeScript("arguments[0].value='john';", usernameTextBox);
	  
	  Thread.sleep(2000);
	  
	  WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
	  
	  js.executeScript("arguments[0].click();", loginButton);
	  
	  Thread.sleep(2000);
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
