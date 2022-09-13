package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//declaration 
public class facebookpage {
@FindBy(id="email")
private WebElement emailtb;

@FindBy(id="pass")
private WebElement passtb;

@FindBy(id="loginbutton")
private WebElement loginbuttonbtn;

//initalization 
public facebookpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

//utilization 
public void emailtextbox(String name) {
	emailtb.sendKeys(name);
	
}
public void passtextbox(String pass) {
	passtb.sendKeys(pass);
}
public void loginbutton() {
	loginbuttonbtn.click();
}

}


