package seleniumInterviewQuestions;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotationsExecutionOrder {
  
  @BeforeSuite
  public void beforeSuite() 
  {
	  int a = 5;
	  int b = 9;
	  int c = a*b;
	  System.out.println("Results of C beforeSuite : "+c);
  }
  @BeforeTest
  public void beforeTest() 
  {
	  int a = 5;
	  int b = 9;
	  int c = a+b;
	  System.out.println("Results of C beforeTest : "+c);
  }
  @BeforeClass
  public void beforeClass() 
  {
	  int a = 5;
	  int b = 9;
	  int c = b-a;
	  System.out.println("Results of C beforeClass : "+c);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  int a = 5;
	  int b = 25;
	  int c = b/a;
	  System.out.println("Results of C beforeMethod : "+c);
  }
  @Test(priority = 0,invocationCount = 2,dependsOnMethods = "test_Three",alwaysRun = true)
  public void test_One() 
  {
	  int a = 5;
	  System.out.println("Results of test_One : "+a);
  }
  @Test(priority = 1,invocationCount = 3,dependsOnMethods = "test_Three",alwaysRun = true)
  public void test_Two() 
  {
	  int b = 10;
	  System.out.println("Results of test_Two : "+b);
  }
  @Test(priority = 2,invocationCount = 2,timeOut = 2000,expectedExceptions = ThreadTimeoutException.class)
  public void test_Three() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  int c = 15;
	  System.out.println("Results of test_Three : "+c);
  }
  @AfterMethod
  public void afterMethod() 
  {
	  int a = 5;
	  int b = 25;
	  int c = b/a;
	  System.out.println("Results of C afterMethod : "+c);
  }
  @AfterClass
  public void afterClass() 
  {
	  int a = 5;
	  int b = 9;
	  int c = b-a;
	  System.out.println("Results of C afterClass : "+c);
  }
  @AfterTest
  public void afterTest() 
  {
	  int a = 5;
	  int b = 19;
	  int c = a+b;
	  System.out.println("Results of C afterTest : "+c);
  }
  @AfterSuite
  public void afterSuite() 
  {
	  int a = 5;
	  int b = 19;
	  int c = a*b;
	  System.out.println("Results of C afterSuite : "+c);
  }
}