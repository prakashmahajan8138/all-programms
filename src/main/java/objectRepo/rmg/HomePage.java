package objectRepo.rmg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Declaration
	
	@FindBy(linkText = "Home")
	private WebElement homeLink;
	
	@FindBy(xpath = "//a[text()='Projects']")
	private WebElement projectsLink;
	
	@FindBy(linkText = "Users")
	private WebElement usersLink;
	
	@FindBy(linkText = "Settings")
	private WebElement settingsLink;
	
	
	@FindBy(linkText = "Logout")
	private WebElement logOutLink;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getProjectsLink() {
		return projectsLink;
	}

	public WebElement getUsersLink() {
		return usersLink;
	}

	public WebElement getSettingsLink() {
		return settingsLink;
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	//Business Logic
	
	public void homePageLink() {
		homeLink.click();
	}
	
	public void projctPageLink() {
		projectsLink.click();
	}
	
	
	public void usersPageLink() {
		usersLink.click();
	}
	
	public void settingPageLink() {
		settingsLink.click();
	}
	
	public void logoutLink() {
		logOutLink.click();
	}
	
	

}
