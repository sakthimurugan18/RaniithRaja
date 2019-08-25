package org.excel.demo.ExcelDataRead;

public class DataMain {
	
	public static void main(String[] args) throws Throwable {
		
		DataRead data = new DataRead("C:\\Users\\ELCOT\\Selenium-workspace\\ExcelDataRead\\InputData\\Data.xlsx");
		// int count = data.getRowCount("Sheet1");
		int Count = data.getRowCount("Sheet1");

		//System.out.println(Count);

		
//		 for (int j = 2; j <=Count; j++) {
//		
//		 System.out.println(DataRead.getCellData("Sheet1", "FName", j));
//		 System.out.println(DataRead.getCellData("Sheet1", "LName", j));
//		 System.out.println(DataRead.getCellData("Sheet1", "Address", j));
//		 System.out.println(DataRead.getCellData("Sheet1", "EmAddress", j));
//		 System.out.println(DataRead.getCellData("Sheet1", "Ph No", j));
//		 System.out.println(DataRead.getCellData("Sheet1", "PassWord", j));
//		 System.out.println(DataRead.getCellData("Sheet1", "ConPassword", j));
//		
//		 }
		
		 }
	}

	


