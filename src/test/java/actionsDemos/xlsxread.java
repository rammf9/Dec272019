package actionsDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class xlsxread {
  @Test
  public void readxl() throws IOException {
	  File src=new File("C:\\Drivers\\logincredentialssel3plus.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook  wb=new XSSFWorkbook(fis);
	  int aindex=wb.getActiveSheetIndex();
	  System.out.println(aindex);
	  int nsheets=wb.getNumberOfSheets();
	  System.out.println(nsheets);
	  XSSFSheet sheet=wb.getSheetAt(0);
	 int nrows=sheet.getLastRowNum();
	 for(int i=0;i<nrows;i++) {
		 System.out.println("Number of colunns:"+sheet.getRow(i).getPhysicalNumberOfCells());
		 String c1=sheet.getRow(i).getCell(0).getStringCellValue();
		 System.out.println(c1);
		 String c2=sheet.getRow(i).getCell(1).getStringCellValue();
		 System.out.println(c2);
	 }
  }
}
