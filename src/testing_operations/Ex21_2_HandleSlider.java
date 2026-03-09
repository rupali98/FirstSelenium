package testing_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ex21_2_HandleSlider
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "https://jqueryui.com/slider/";
	
  @Test
  public void f() throws InterruptedException
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  Thread.sleep(1000);
	  
	  driver.switchTo().frame(0);
	  Thread.sleep(1000);
	  
	  
	  WebElement slider = driver.findElement(By.xpath("//*[@id='slider']"));
	  Actions action = new Actions(driver);
	  
	  
	  
//	  Performing sliding operations by using (X-Y coordinates)
	  action.dragAndDropBy(slider, 30, 0).perform();
	  Thread.sleep(1000);
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
