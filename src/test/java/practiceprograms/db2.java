package practiceprograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class db2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/writeexcel.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("sheet1");
        int count=sh.getLastRowNum();
        for(int i=1;i<count;i++)
        {
        	Row row = sh.getRow(i);
        	String firstcoldata = row.getCell(0).getStringCellValue();
            String secondcoldata = row.getCell(1).getStringCellValue();
            System.out.println(firstcoldata + "\t" + secondcoldata);
        	       
        	//Random ran = new Random();
        	//int randomnum=ran.nextInt(1000);
        	//System.out.println(randomnum);
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
            
            
            
            
            
            
            
        	
        }
	}

}
