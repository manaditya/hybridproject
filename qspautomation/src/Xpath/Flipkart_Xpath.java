package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.className("")).sendKeys();
		Thread.sleep(3000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("")).getText();
		System.out.println("");
		

	}

}
