package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("q")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
	     String priceOfSamsungf22 = driver.findElement(By.xpath("")).getText();
	     System.out.println("price of samsung f22 : "+priceOfSamsungf22);
	}
}
		
		
		
		

	}

}
