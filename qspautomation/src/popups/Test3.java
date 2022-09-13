package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.actitime.com/login.do");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.name("pwd")).sendKeys("manager");
     driver.findElement(By.id("loginButton")).click(); 
     
     driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
     
     driver.findElement(By.xpath("(//a[@class='x-date-date'])[1]"));

	}

}
