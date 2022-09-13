package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.name("q"));
		
		Dimension ele = search.getSize();
		System.out.println(ele.getHeight());
		System.out.println(ele.getWidth());
		
		driver.close();
		

	}

}
