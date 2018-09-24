package zoom12;

import utils.ExcelUtils;

public class TestData {
	
	public static String USERNAME; 
	public static String PASSWORD; 

	public void readExcelData()
	{
		ExcelUtils Tdata= new ExcelUtils("C:\\Users\\Sanket\\git\\repository\\zoom12\\resources\\utils\\zoom12User.xlsx",
	
			"zoom12Users");
		try {
			int rows= Tdata.excel_get_rows();
			int cols= Tdata.excel_get_columns();
			System.out.println("Total rows- "+ rows+ " Total Cols- "+cols);
			String data[][] = new String[rows][cols];
			for(int r=1;r<=1;r++)
			{
				for(int c=0;c<cols;c++)
				{
					data[r][c]=Tdata.getCellDataasstring(r, c);
					System.out.println(data[r][c]);
				}
			}
			
			USERNAME= data[1][0];
			PASSWORD=data[1][1];
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
