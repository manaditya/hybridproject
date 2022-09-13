package Testnextgeneration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test5 {
    public  WebDriver driver;
    
    @BeforeMethod
    public void openApp() {
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.facebook.com/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    }
    @Test
    public void createapage() {
    	driver.findElement(By.linkText("Create a Page")).click();
    	driver.findElement(By.xpath("(//div[text()='Get Started'])[1]")).click();
    	Reporter.log(driver.getTitle(),true);
    	Reporter.log(driver.getCurrentUrl(),true);
    	
    }
    
    @AfterMethod
    public void closeApp() {
    	driver.close();
    }

}
