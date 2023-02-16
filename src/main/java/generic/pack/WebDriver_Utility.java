package generic.pack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class WebDriver_Utility {
	WebDriver driver;
	
	public void closeBrowser()
	{
		driver.close();
	}

	
	public void handlealertAndAccept(String username,String password) throws AWTException
	{
		Alert al = driver.switchTo().alert();
		al.sendKeys(username);
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		
		al.sendKeys(password);
		al.accept();
	}
	
	
	public void waitPageToLoad() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
