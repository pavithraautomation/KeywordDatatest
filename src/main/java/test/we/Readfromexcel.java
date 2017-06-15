package test.we;
import org.apache.commons.lang3.StringUtils;
import java.io.File;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.sql.Date; 
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map;
import java.util.Set; 
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; /** * Sample Java program to read and write Excel file in Java using Apache POI * */ 
public class Readfromexcel 
{
	@Test
	public static void readexcel()
	{
		try{
			String excelFilePath = "/Users/phegde/Downloads/Auto_BESAPI_Sanity.xlsx";
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
			 Workbook workbook = new XSSFWorkbook(inputStream);
			 String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
			 System.out.println(methodName);
		        Sheet firstSheet = workbook.getSheet("Staging");
		        int rowNum = firstSheet.getLastRowNum()+1;
		        Iterator<Row> rowIterator =  firstSheet.iterator();
		        while (rowIterator.hasNext())
		        { 
		        Row row = rowIterator.next();
		        Iterator<Cell> cellIterator = row.cellIterator();
		        for (int i=1;i<=15000;i++){
					String tcName = getCellValue(firstSheet,i, 1);
					//System.out.println(tcName);
					if(firstSheet.tri.equalsIgnoreCase(methodName)){
						startRow = i;
						for(int j =startRow+1;j<=startRow+100;j++){
							String temp = getCellValue(tcSheet, j, 1);
						System.out.println(temp);
							if(temp.equalsIgnoreCase(methodName) || temp.equalsIgnoreCase("")){
								//add code later
							}
							else{
								endRow = j;
								break;
							}
						}
						break;
					}
				}
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		       /* while (cellIterator.hasNext()) 
	            {
		        	Cell cell = cellIterator.next();
	            	//System.out.println(cell.getStringCellValue());
	            	switch (cell.getCellType()) 
	            	{ 
	            	case Cell.CELL_TYPE_STRING: 
	            		//System.out.print(row.getCell(0).getStringCellValue()); 
	            		break; 
	            		case Cell.CELL_TYPE_NUMERIC:
	            			//System.out.print(cell.getNumericCellValue() + "\t"); 
	            			break; 
	            			case Cell.CELL_TYPE_BOOLEAN: 
	            				//System.out.print(cell.getBooleanCellValue() + "\t");
	            				break; 
	            				default:
	            	}

	            	
	            	
	            }*/
	}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
		        