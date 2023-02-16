package objectRepo.rmg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy(name="username")
	private WebElement usernameTextField;
	
	@FindBy(name="password")
	private WebElement passwordTextField;
	
//	@FindBy(partialLinkText = "Sign in")
//	private WebElement signInButton;
	
	//Initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	//getter methods
//	public WebElement getSignInButton() {
//		return signInButton;
	//}

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	
	//Business Logic
	public void loginPage(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		
//		signInButton.click();
	}
	
	
	
	
	
	
	
	

}
