package Testnextgeneration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test4 {
   public WebDriver driver;
   
   
   @BeforeMethod
   public void openApp() {
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
     
   @Test
   public void forgotpassword() {
	   driver.findElement(By.linkText("Forgotten password?")).click();
	   driver.findElement(By.id("identify_email")).sendKeys("123456");
	   driver.findElement(By.id("did_submit")).click();
	   Reporter.log(driver.getTitle(),true);
	   Reporter.log(driver.getCurrentUrl(),true);
	   
   }
   
   @AfterMethod
   public void closeApp() {
	   driver.close();
   }
}

