package zoom12;

import utils.ExcelUtils;

public class TestData {

	public String USERNAME;
	public String PASSWORD;
	public static boolean flag = true;

	public boolean readExcelData() {
		ExcelUtils Tdata = new ExcelUtils(System.getProperty("user.dir")+
				"\\resources\\utils\\zoom12User.xlsx", "zoom12Users");
		try {
			int rows = Tdata.excel_get_rows();
			int cols = Tdata.excel_get_columns();
			System.out.println("************************************************************");
			System.out.println("Total rows- " + rows + " Total Cols- " + cols);
			System.out.println("************************************************************");
			String data[][] = new String[rows][cols];
			for (int r = 1; r <= 1; r++) {
				for (int c = 0; c < cols; c++) {
					data[r][c] = Tdata.getCellDataasstring(r, c);
					System.out.print(data[r][c] + "     ");
				}
			}
			System.out.println();

			USERNAME = data[1][0];
			PASSWORD = data[1][1];
			System.out.println("username is " + USERNAME);
			try {
				if (USERNAME.isEmpty()) {
					flag = false;
				}
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("in flag check");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e);
		}
		return flag;

	}

}
