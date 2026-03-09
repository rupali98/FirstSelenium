package testing_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex24_HandleFrames 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
	String url ="https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	
  @Test
  public void f() throws InterruptedException 
  {
	  driver = new ChromeDriver();
	  driver.get(url);
	  
	  Thread.sleep(1000);
	  
//	  Finding frame count
	  int framesCount = driver.findElements(By.tagName("iframe")).size();
	  System.out.println(framesCount);
	  
	  Thread.sleep(1000);
	  
//	  switch to first frame at left top pane by using frame name
	  driver.switchTo().frame("packageListFrame");
	  
	  WebElement firstFrameLink = driver.findElement(By.linkText("org.openqa.selenium.cli"));
	  firstFrameLink.click();
	  
//	  switch from first frame to main page
	  driver.switchTo().defaultContent();
	  
	  Thread.sleep(1000);
	  
//	  switch to second frame at left bottom pane by using frame index
	  driver.switchTo().frame(1);
	  
	  WebElement secondFrameLink = driver.findElement(By.xpath("//span[text()='CliCommand']"));
	  secondFrameLink.click();
	  
//	  Switch from second frame to main page
	  driver.switchTo().defaultContent();
	  
	  Thread.sleep(1000);
	  
//	  switch to third frame at right pane by using frame xpath
	  
	  WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='overview-summary.html']"));
      driver.switchTo().frame(frameElement);
      
      WebElement thirdFrameLink = driver.findElement(By.linkText("CompletionCommand"));
      thirdFrameLink.click();
	  
      Thread.sleep(1000);
      driver.quit();	
	  
	  
  }
}
