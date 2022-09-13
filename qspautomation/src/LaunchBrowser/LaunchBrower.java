package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrower {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		new ChromeDriver();
	}

}
