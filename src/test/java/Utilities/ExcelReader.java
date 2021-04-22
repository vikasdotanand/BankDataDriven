package Utilities;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public ExcelReader(String path)
	{
		try {
			ExcelReader.workbook = new XSSFWorkbook(path);
		} catch (IOException e) {
			System.out.println("Wrong File Path");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getRowCount(String sheetName)
	{
		sheet = workbook.getSheet(sheetName);
		return sheet.getLastRowNum();
	}
	
	public int getColCount(String sheetName)
	{
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(0);
		return row.getLastCellNum();
	}
	
	public Object getCellData(int rowNum, int colNum, String sheetName)
	{
		//Object data;
		
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		if(cell.getCellTypeEnum() == CellType.STRING)
		{
			return cell.getStringCellValue();
		}
		
		if(cell.getCellTypeEnum() == CellType.NUMERIC)
		{
			return Double.toString((cell.getNumericCellValue()));
					
		}
		else
			return null;
		
	}

}
