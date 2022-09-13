package Locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("adity");
		driver.findElement(By.id("password")).sendKeys("Adi");
		
		driver.findElement(By.xpath("//button[@class=\"btn__primary--large from__button--floating\"]")).click();

	}

}
