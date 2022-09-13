package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {
	@DataProvider
	public Object[][] getData() {
		Object[] []a=new Object[3][2];
		a[0][0]="aditya sontakke";
		a[0][1]="good boy";
		
		a[1][0]="123456789";
		a[1][1]="987654321";
		
		a[2][0]="aditya321!@#$";
		a[2][1]="654321aditya!@#$";
		return a;
	}
	
	
	@Test(dataProvider = "getData")
	public void Demo(String username,String pwd) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}

}
