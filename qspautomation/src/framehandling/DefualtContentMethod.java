package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefualtContentMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/user%20nc/Desktop/frame.html");
		
		driver.findElement(By.id("un")).sendKeys("admin");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.id("pwd")).sendKeys("manager");
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.id("un")).clear();
		

	}

}
