package firstselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		1.launch the chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RUBIRAJD\\eclipse-workspace\\FirstSelenium\\drivers\\chromedriver.exe");
		
//		way 2
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
//		2.launch the para bank app
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(2000);
		
//		verify the page title
		
		String expectedResult = "ParaBank | Welcome | Online Banking";
		String actualResult = driver.getTitle();
		
		
		if(expectedResult.equals(actualResult))
		{
			System.out.println("Test is Passed");
		}
		else
		{
			System.out.println("Test if Failed");
		}
		Thread.sleep(2000);
		
//		close the chrome browser
//		driver.close();
		
		driver.quit();
		
	}

}
