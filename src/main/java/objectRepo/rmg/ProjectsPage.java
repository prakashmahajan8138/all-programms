package objectRepo.rmg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsPage {
	//declaration
	@FindBy(linkText = "Create Project")
	private WebElement createButton;
	
	
	//Initialization
	public ProjectsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//getter method

	public WebElement getCreateButton() {
		return createButton;
	}
	
	//Business logic 
	public void clickOnCreateProjectLink()
	{
		createButton.click();
	}
	
	
	
	

}
