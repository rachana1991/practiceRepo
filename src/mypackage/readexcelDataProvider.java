package mypackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class readexcelDataProvider {

	@DataProvider(name="testdataprovider")
	public Object[][] dataSupplier() throws InvalidFormatException, IOException {

		 
		FileInputStream fis = new FileInputStream("C:\\Users\\rohil\\eclipse-workspace\\PracticeProg\\src\\testdata\\testdata.xlsx");
		Workbook book =  WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("readexcel");
		int rowCount= sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		Object data[][] = new Object[rowCount][colCount];
		for(int i= 0; i<rowCount; i++)
		{
			for (int j = 0 ; j<colCount; j++)
			{
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
	@Test(dataProvider="testdataprovider" )
	public void Register(String firstname, String lastname, String mobile, String password, String subs)
	{
		
		System.out.println(firstname +","+ lastname + ","+ mobile+","+password +"," + subs);
	}

}


