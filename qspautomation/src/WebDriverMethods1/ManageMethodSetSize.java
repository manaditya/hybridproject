package WebDriverMethods1;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetSize {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//set the size of the browser
		//new dimension(width,height);
		driver.get("http://www.google.com");
		Dimension targetSize = new Dimension(350,250);
		driver.manage().window().maximize();

	}

}
