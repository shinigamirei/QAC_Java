package com.qa.DDTests;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class DDTesting {

	@Test
	public void loginTest() throws Exception {
		FileInputStream file = new FileInputStream(Constants.excelTestPath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for (int row = 0; row < sheet.getPhysicalNumberOfRows(); row++) {
			for (int collumn = 0; collumn < sheet.getRow(row).getPhysicalNumberOfCells(); collumn++) {
				XSSFCell cell = sheet.getRow(row).getCell(collumn);
				String cellContents = cell.getStringCellValue();
				System.out.println(cellContents);
			}
		}
		file.close();
	}
}
