package projectMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filehandle {
	public static void main(String[] args) throws IOException {
		String folder= "C:\\Users\\shriniwas shete\\Desktop\\Book1.xlsx";
		FileInputStream f = new FileInputStream(folder);
		String name= WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		
		FileInputStream f1 = new FileInputStream(folder);
		double d= WorkbookFactory.create(f1).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(d);
	}

}
