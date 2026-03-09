package config_utility_base_1;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestClass extends BaseClass
{
	

@Test
public void test01() throws InterruptedException {
WebElement aboutUsLink = driver.findElement(By.linkText("About Us"));
aboutUsLink.click();
String expectedTitle = "ParaBank | About Us";
String actualTitle = driver.getTitle();
assertEquals(actualTitle, expectedTitle);
System.out.println(driver.getTitle());
Thread.sleep(1000);
}
}