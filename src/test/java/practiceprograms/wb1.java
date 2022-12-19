package practiceprograms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;
import com.mysql.cj.result.Row;

public class wb1 {

	public static void main(String[] args) throws IOException
	
	{
	    FileOutputStream fis = new FileOutputStream("./src/test/resources/writeexcel.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("sheet1");
	     Row  row = sh.getRow(1);
	      Cell cell = row.getCell(2);
	      String data=cell.getStringCellValue();
	      System.out.println(data);
	      wb.close();
	}

	      
	     
	                 

	}


