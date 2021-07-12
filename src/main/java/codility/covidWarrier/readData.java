package codility.covidWarrier;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readData {
	  public static XSSFWorkbook wb;
	    public static XSSFSheet sheet;
	     
	    public readData(String excelPath)
	    {
	            try {
	                FileInputStream fis = new FileInputStream(excelPath);
	                wb = new XSSFWorkbook(fis);             
	            } 
	            catch (Exception e) {
	                System.out.println(e.getMessage()); 
	            }                   
	        }   
	    public String readData (int row, int column ){
	         
	        sheet = wb.getSheet("data");
	        String data = sheet.getRow(row).getCell(column).getStringCellValue();
	            return data;            
	 }
}