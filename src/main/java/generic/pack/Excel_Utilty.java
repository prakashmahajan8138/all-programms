package generic.pack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utilty {
	
	public String readDataFromExcel(String sheetNAme,int rowNum,int cellNum) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetNAme);
		Row row = sh.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		return value;
	}
	
	
	
	public int getLastRowCount(String sheetNAme,int rowNum,int cellNum) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetNAme);
		int value = sh.getLastRowNum();
		
		return value;
	}
	
	
	

}
