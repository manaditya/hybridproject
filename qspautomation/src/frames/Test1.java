package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         //		
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		//step1 = right click , click on inspect mouse over on this (fashion) then there 
		// is option called as (Source) click on this press 
		
		

	}

}
