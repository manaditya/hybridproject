package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimepage {
	//declaration
@FindBy(id="username")
private WebElement usernametb;

@FindBy(name="pwd")
private WebElement passwordtb;

@FindBy(xpath = "//div[text()='Login ']")
private WebElement Loginbtn;                     

//initalization 
public Actitimepage(WebDriver driver) {
	PageFactory.initElements(driver,this);    
}
//utilization
public void usernametextbox(String name) {
	  usernametb.sendKeys(name);                                                                                                              //method
}

public void passwordtextbox(String pwd) {
	 passwordtb.sendKeys(pwd);
}
public void loginbutton() {
	Loginbtn.click();
}

}
