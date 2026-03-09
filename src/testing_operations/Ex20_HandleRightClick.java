package testing_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ex20_HandleRightClick 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "http://the-internet.herokuapp.com/context_menu";
  @Test
  public void f() throws InterruptedException
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  
	  Actions action = new Actions(driver);
	  
	  WebElement element = driver.findElement(By.id("hot-spot"));
	  action.contextClick(element).perform();
	  
	  Thread.sleep(1000);
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
