package SelfProgram;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchfirefox1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//to avoid the illegalStateException
		FirefoxDriver driver = new FirefoxDriver();//to open the browser
		driver.manage().window().maximize();//maximize the browser
		driver.get("https://www.instagram.com");//launch the web app
	    Thread.sleep(2000);//provide the delay of 2sec
	    driver.close();//close the browser

	}

}
