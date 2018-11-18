package readwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constantvalues.ConstantValues;

public class ExcelRW {

	static XSSFSheet ws;
	static XSSFWorkbook wb;
	static XSSFRow r;
	static XSSFCell c;
	
	public static void excelPath(String pathname) throws Exception {
		File f = new File(pathname);
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
	}
	
	public static String readValue(String sheetname, int rownumber, int columnber) {
		ws = wb.getSheet(sheetname);
		c = ws.getRow(rownumber).getCell(columnber);
		
		if (c.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			String numericvalue = NumberToTextConverter.toText(c.getNumericCellValue());
			return numericvalue;
		} else {
			String cellValue = c.getStringCellValue();
			return cellValue;
		}
	}
	
	public static void writeValue(String sheetname, int rownumber, int columnnumber, String value) throws Exception {
		ws = wb.getSheet(sheetname);
		c = ws.getRow(rownumber).getCell(columnnumber);
		c.setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(ConstantValues.excelPath);
		wb.write(fos);
		fos.close();
		
		FileInputStream fis = new FileInputStream(ConstantValues.excelPath);
		wb = new XSSFWorkbook(fis);
		
	}
}
