package generic.pack;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.rmg.HomePage;
import objectRepo.rmg.LoginPage;


public class BaseClass{
	public static WebDriver driver;
	public WebDriver sDriver;
	public File_Utility flib = new File_Utility();
	
	@BeforeSuite
	public void getConnection() {
		System.out.println("Connection established");
	}
	
	@BeforeTest
	public void executionType() {
		System.out.println("executed");
	}
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		System.out.println("Launching browser");
		String Browser=flib.getPropertyKey("browser");
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("please specify proper browser value");
		}
		sDriver=driver;
		
	}
	@BeforeMethod
	public void loginApp() throws IOException
	{
		System.out.println("Login into application");
		
		String url=flib.getPropertyKey("url");
		
		driver.get(url);
		driver.manage().window().maximize();
		
		String username=flib.getPropertyKey("usn");
		String password=flib.getPropertyKey("pwd");
		
		LoginPage lp = new LoginPage(driver);
		lp.loginPage(username, password);
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("logout");
		HomePage hp = new HomePage(driver);
		hp.logoutLink();
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("closing browser");
		WebDriver_Utility wlib=new WebDriver_Utility();
		wlib.closeBrowser();
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("executed ");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("connection closed");
		
	}
	
	
	
	

}
