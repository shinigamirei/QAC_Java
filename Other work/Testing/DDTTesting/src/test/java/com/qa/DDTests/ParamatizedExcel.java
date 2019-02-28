package com.qa.DDTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Collection;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamatizedExcel {

	@Parameters
	public static Collection<Object[]> data() throws Exception {

		FileInputStream file = new FileInputStream(Constants.excelTestPath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		Object[][] sheetAsArray = new Object[sheet.getPhysicalNumberOfRows()][sheet.getRow(0)
				.getPhysicalNumberOfCells()];

		for (int row = 0; row < sheet.getPhysicalNumberOfRows(); row++) {
			for (int collumn = 0; collumn < sheet.getRow(row).getPhysicalNumberOfCells(); collumn++) {
				XSSFCell cell = sheet.getRow(row).getCell(collumn);
				String cellContents = cell.getStringCellValue();
				sheetAsArray[row][collumn] = cellContents;

			}
		}
		file.close();

		return Arrays.asList(sheetAsArray);
	}

	public String contentsA;
	public String contentsB;
	public String contentsC;
	public String contentsD;
	public String contentsE;

	public ParamatizedExcel(String contentA, String contentB, String contentC, String contentD, String contentE) {
		this.contentsA = contentA;
		this.contentsB = contentB;
		this.contentsC = contentC;
		this.contentsD = contentD;
		this.contentsE = contentE;
	}

	@Test
	public void test() {
		System.out.println(contentsA + " " + contentsB + " " + contentsC + " " + contentsD + " " + contentsE);
	}

	@Test
	public void writeTest() throws Exception {
		FileInputStream file = new FileInputStream(Constants.excelTestPath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);

		for (int i = 1; i < 5; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(3);

			cell.setCellValue("yes");
		}
		FileOutputStream fileOut = new FileOutputStream(Constants.excelTestPath);

		workbook.write(fileOut);
		fileOut.flush();
		fileOut.close();
		file.close();

	}

}
