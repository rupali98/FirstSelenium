package testing_operations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex23_1_HandleAlert 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
	
	String url = "https://the-internet.herouapp.com/javascript_alerts";
	
  @Test
  public void f() throws InterruptedException
  {
	  driver = new ChromeDriver();
	  driver.get(url);
	  
	  Thread.sleep(1000);
	  
	  WebElement alertElement = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
	  alertElement.click();
	  
	  Thread.sleep(1000);
	  
	  Alert alert = driver.switchTo().alert();
	  
//	  Print the alert text
	  System.out.println(alert.getText());
	  
	  Thread.sleep(1000);
	  
//	  Enter text in alert text box
	  alert.sendKeys("Hello Alert");
	  
	  Thread.sleep(1000);
	  
//	  click Alert OK Button
	  alert.accept();
	  
	  Thread.sleep(1000);
	  
//	  open the alert again
	  alertElement.click();
	  Thread.sleep(1000);
	  
//	  Click Alert cancel button
	  alert.dismiss();
	  
	  Thread.sleep(1000);
	  driver.quit();
	 
	  
  }
}
