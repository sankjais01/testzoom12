package zoom12;

import utils.ExcelUtils;

public class TestData {
	
	public static String USERNAME; 
	public static String PASSWORD; 

	public void readExcelData()
	{
		ExcelUtils Tdata= new ExcelUtils("C:\\Users\\sanket\\git\\testzoom12\\zoom12\\resources\\utils\\zoom12User.xlsx",
	
			"zoom12Users");
		try {
			int rows= Tdata.excel_get_rows();
			int cols= Tdata.excel_get_columns();
			System.out.println("Total rows- "+ rows+ " Total Cols- "+cols);
			String data[][] = null;
			for(int r=0;r<1;r++)
			{
				for(int c=0;c<cols;c++)
				{
					data[r][c]=Tdata.getCellDataasstring(r, c);
				}
			}
			
			USERNAME= data[0][1];
			PASSWORD=data[0][2];
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
