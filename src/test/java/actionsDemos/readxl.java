package actionsDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class readxl {
  @Test
  public void f() throws IOException {
	  File src=new File("C:\\Drivers\\logincredentialssel3plus.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook  wb=new XSSFWorkbook(fis);
	  int ns=wb.getNumberOfSheets();
	  System.out.println(ns);
	  
	  XSSFSheet sheet=wb.getSheetAt(0);
	  System.out.println("Sheet name at 0th index:"+sheet.getSheetName());
	  Row row = sheet.getRow(0);
	  Cell cell = row.getCell(0);
	  System.out.println(cell);
	 
	  System.out.println(sheet.getRow(0).getCell(0));
	  System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());	
	  int rowcount=sheet.getLastRowNum();
	  
	  System.out.println("last row number:"+rowcount);
	  for(int i=0;i<rowcount;i++) {
		  System.out.println("Number of colunns:"+sheet.getRow(i).getPhysicalNumberOfCells());
		  String c1=sheet.getRow(i).getCell(0).getStringCellValue();
		  String c2=sheet.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("c1 data:"+c1);
		  System.out.println("c2 data:"+c2);
		  
		  System.out.println("_----------------------------");
	  }
	}
	  
  }

