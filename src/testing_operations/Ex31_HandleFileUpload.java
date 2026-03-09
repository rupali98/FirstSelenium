package testing_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex31_HandleFileUpload 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
	String url = "http://the-internet.herouapp.com/upload";
	String filePath = projectPath + "\\files\\donaldduck.png";
	
  @Test
  public void f() throws InterruptedException
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  
	  WebElement chooseFile = driver.findElement(By.id("file-upload"));
	  chooseFile.sendKeys(filePath);
	  
	  Thread.sleep(1000);
	  
	  WebElement upload = driver.findElement(By.id("file-submit"));
	  upload.click();
	  
	  Thread.sleep(1000);
	  
	  String text = driver.findElement(By.xpath("//*[@id='content'])/div/h3")).getText();
	  System.out.println(text);
	  
	  Thread.sleep(2000);
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
