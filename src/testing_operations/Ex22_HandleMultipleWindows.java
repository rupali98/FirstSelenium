package testing_operations;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex22_HandleMultipleWindows 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	
	String url = "http://the-internet.herouapp.com/";
	
  @Test
  public void f() throws Exception
  {
	  driver = new ChromeDriver();
	  driver.get(url);
	  Thread.sleep(1000);
	  
	  String parent_window = driver.getWindowHandle();
	  
	  System.out.println(parent_window);
	  
	  WebElement multipleWindowsLink = driver.findElement(By.linkText("Multiple Windows"));
	  multipleWindowsLink.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement clickHereLink = driver.findElement(By.xpath("//a[text()='Click Here']"));
	  clickHereLink.click();
	  
	  Thread.sleep(1000);
	  
	  Set<String> all_windows = driver.getWindowHandles();
	  
	  System.out.println(all_windows);
	  
	  int count = all_windows.size();
	  
	  System.out.println(count);
	  
	  for(String child_window:all_windows)
	  {
		  if(!parent_window.equals(child_window))
		  {
			  driver.switchTo().window(child_window);
			  System.out.println("Child window title --> " +driver.getTitle());
		  }
	  }
	  
	  
	  Thread.sleep(1000);
	  driver.close();
	  Thread.sleep(1000);
	  
	  driver.switchTo().window(parent_window);
	  
	  System.out.println("Parent window title-->" +driver.getTitle());
	  Thread.sleep(1000);
	  
	  driver.quit();
  }
}