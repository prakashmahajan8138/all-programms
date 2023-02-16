package objectRepo.rmg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Project {
	
	//declaration
	@FindBy(name = "projectName")
	private WebElement projctnameTextField;
	
	@FindBy(name="createdBy")
	private WebElement createdByTextField;
	
	@FindBy(name="status")
	private WebElement statusLink;
	
	
	@FindBy(className = "btn btn-success")
	private WebElement submitButton;
	
	public WebElement getSubmitButton() {
		return submitButton;
	}

	//Initialization
	public Create_Project(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//getter
	public WebElement getProjctnameTextField() {
		return projctnameTextField;
	}

	public WebElement getCreatedByTextField() {
		return createdByTextField;
	}

	public WebElement getStatusLink() {
		return statusLink;
	}
	
	//business logic
	
	public void createproject(String projName, String createdBy) {
		projctnameTextField.sendKeys(projName);
		createdByTextField.sendKeys(createdBy);
		statusLink.click();
		submitButton.click();
	}
	
	
	
	
}