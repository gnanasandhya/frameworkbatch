package org.pom;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver,this);
		
	}
    @FindBy(id="email")
    private WebElement userName;
    @FindBy(id="pass")
    private WebElement pass;
    @FindBy(name="login")
    private WebElement loginButton;
    
	public WebElement getUserName()
 {
		return userName;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
    
    
    
    
}
