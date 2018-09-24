package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private XSSFSheet ExcelWSheet;
	private XSSFWorkbook ExcelWBook;

	public ExcelUtils(String Path, String SheetName) {
		try {
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int excel_get_rows() throws Exception {
		try {
			return ExcelWSheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			throw (e);
		}

	}

	public short excel_get_columns() throws Exception {

		try {
			return ExcelWSheet.getRow(0).getLastCellNum();// getPhysicalNumberOfRows();
		} catch (Exception e) {
			throw (e);
		}
	}

	// This method to get the data and get the value as strings.
	public String getCellDataasstring(int RowNum, int ColNum) throws Exception {

		try {
			String CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
			// System.out.println(CellData);
			return CellData;
		} catch (Exception e) {
			// System.err.println(e);
			return "Errors in Getting Cell Data";
		}
	}

	// This method to get the data and get the value as number.
	public double getCellDataasnumber(int RowNum, int ColNum) throws Exception {

		try {
			double CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
			System.out.println("The value of CellData " + CellData);
			return CellData;
		} catch (Exception e) {
			return 000.00;
		}
	}

}
