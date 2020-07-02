package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public  static HashMap<String, String> readexceldata() throws IOException {
		// TODO Auto-generated method stub
		String value ="";
		HashMap<String, String> tmp = null;
		
		FileInputStream finput = new FileInputStream(System.getProperty("user.dir")+"\\src\\datatables\\testdata.xlsx");

		
		XSSFWorkbook wb = new XSSFWorkbook(finput);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int irowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=1; i<= irowcount;i++) {
			tmp = new HashMap<String, String>();
			
			
			for(int j=0;j< columncount;j++) {
				
				XSSFCell cell = sheet.getRow(i).getCell(j);
				if(cell == null) {
					
					value = "";
				
				}else {
					
					String CellType = cell.getCellType().toString();
					
					switch(CellType) {
					
					case "NUMERIC" :
						value = cell.getStringCellValue();
						break;
					case "STRING":
							value = cell.getStringCellValue();
							break;
					case "BLANK":
							value = cell.getStringCellValue();
							break;
					case "BOOLEAN":
						value = cell.toString();
						break;				
						
						
					}
				}
				
				if(j ==0 ) {
					tmp.put("source", value);
				}else {
					tmp.put("destination", value);
				}
				
			}
			
			
		}
//		
		return tmp;

	}

}
