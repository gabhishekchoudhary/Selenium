package generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		//File fil = new File("C:\\Users\\abhia\\OneDrive\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\abhia\\OneDrive\\Desktop\\TestData.xlsx");
		
		Workbook wb = new HSSFWorkbook(fis);
		
		String data = wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
		System.out.println(data);
		

	}

}
