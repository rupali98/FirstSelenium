package Testng_other_operations;

import org.testng.annotations.Test;

public class Ex08_TestGroup 
{
	
  @Test(groups="Regression")
  public void f() 
  {
	  System.out.println("Regression Test1");
  }
  
  @Test(groups="Regression")
  public void test02()
  {
	  System.out.println("Regression Test02");
  }
  
  @Test(groups="Smoke")
  public void test03()
  {
	  System.out.println("Smoke Test");
  }
  
  @Test(groups= {"Regression","Sanity"})
  public void test04()
  {
	  System.out.println("Regression & Sanity Test");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
