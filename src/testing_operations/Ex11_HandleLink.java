package testing_operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex11_HandleLink 
{
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
  @Test
  public void f() throws InterruptedException
  {
	  driver = new ChromeDriver();
	  driver.get(url);
	  
	  Thread.sleep(1000);
	  
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  
	  int linksCount = links.size();
	  System.out.println(linksCount);
	  Thread.sleep(1000);
	  
	  links.get(3).click();
	  
	  Thread.sleep(1000);
	  
	  System.out.println(driver.getTitle());
	  
	  Thread.sleep(1000);
	  
	  driver.quit();
	  
	  
  }
}
