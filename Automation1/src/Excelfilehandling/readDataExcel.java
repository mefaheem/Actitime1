package Excelfilehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readDataExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream ("./data/testscript.XLSX");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet("createsheet").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
