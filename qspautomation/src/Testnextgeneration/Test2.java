package Testnextgeneration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 {
	public WebDriver driver;
	
@BeforeMethod
public void openApp() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test
public void login() {
	driver.findElement(By.id("email")).sendKeys("adityasontakke224@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	Reporter.log(title,true);

	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
	
} 
@AfterMethod
public void closeApp() {
	driver.close();
}

}
