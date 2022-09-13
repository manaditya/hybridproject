package screenshort;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //step:typecasting 
        
       TakesScreenshot ts=(TakesScreenshot) driver;
       
       //step2:we can access the method and store in the RAM
       File src = ts.getScreenshotAs(OutputType.FILE);
       
       //step3:I have to specify the location
       File dest = new File("./photo/amazon.png");
       
       //step4:copy and paste from RAM to required location 
       FileUtils.copyFile(src, dest);
       
       driver.close();
       
       

	}

}
