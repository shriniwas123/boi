package projectMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFullSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String sheet = "C:\\Users\\shriniwas shete\\Desktop\\Book1.xlsx";
		FileInputStream f = new FileInputStream(sheet);
		Sheet s = WorkbookFactory.create(f).getSheet("Sheet1");
		int rownumber = s.getLastRowNum();

		int totalrow = rownumber + 1;
		System.out.println(totalrow);
		Row R = s.getRow(0);
		int rows = R.getLastCellNum();
		System.out.println(R.getLastCellNum());

		for (int i = 0; i < totalrow; i++) {
			for (int j = 0; j < rows; j++) {

				String rowvalue = s.getRow(i).getCell(j).getStringCellValue();
				System.out.print(rowvalue + "   ");
			}
			System.out.println("");
		}

	}

}
