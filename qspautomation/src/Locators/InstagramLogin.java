package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("adii_._0107");
		driver.findElement(By.name("password")).sendKeys("1@1@1@1@");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("Log In")).click();
		

	}

}
