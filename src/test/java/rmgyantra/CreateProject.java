package rmgyantra;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

import generic.pack.BaseClass;
import generic.pack.Excel_Utilty;
import generic.pack.File_Utility;
import generic.pack.WebDriver_Utility;
import objectRepo.rmg.Create_Project;
import objectRepo.rmg.HomePage;

public class CreateProject extends BaseClass {

	@org.testng.annotations.Test
	public void createProjectTest() throws EncryptedDocumentException, IOException, AWTException {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.waitPageToLoad();
		 driver.findElement(By.xpath("//a[text()='Projects']")).click();

		Create_Project cp = new Create_Project(driver);

		Excel_Utilty elib = new Excel_Utilty();
		String projName = elib.readDataFromExcel("projectDetails", 1, 1);
		String createdBy = elib.readDataFromExcel("projectDetails", 2, 1);
		cp.createproject(projName, createdBy);


	}
}
