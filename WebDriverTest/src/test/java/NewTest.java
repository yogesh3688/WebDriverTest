import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	private WebDriver driver;
	private String strUrl = "https://www.hamleys.com/";
	
  @Test
  public void f() {
	  driver.get(strUrl);
	  System.out.println("Url : "+driver.getCurrentUrl());
	  System.out.println("Title : "+driver.getTitle());
	 // AssertJUnit.assertEquals("Hamelys",driver.getTitle());
	  AssertJUnit.assertEquals("Toys and Games from Hamleys Toy Shop - the Finest Childrens Toy Shop in the World",driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  String absPath = new File("").getAbsolutePath(); 
	  System.setProperty("webdriver.chrome.driver", absPath+"\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
