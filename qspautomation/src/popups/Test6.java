package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test6 {

	public static void main(String[] args) {
		
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();  
		driver.manage().window().maximize();
		driver.get("https://www.quikr.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

}
