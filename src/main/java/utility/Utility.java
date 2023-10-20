package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.base.BaseClass;

public class Utility extends BaseClass {

	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public Sheet getSheet(String sheetName) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(
				projectPath + "\\src\\main\\resources\\data\\Book1.xlsx");
		Sheet sh = (Sheet) WorkbookFactory.create(fileInputStream).getSheet(sheetName);
		return sh;
	}

	public Object getSingleData(int rowNum, int cellNum, Sheet sh) {
		if (sh.getRow(rowNum).getCell(cellNum).getCellType().toString().equalsIgnoreCase("string"))
			return sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
		else
			return sh.getRow(rowNum).getCell(cellNum).getNumericCellValue();
	}

	public HashMap<String, String> getAllExcelData(Sheet sh) {
		HashMap<String, String> hm = new HashMap<>();

		for (int i = 1; i <= sh.getLastRowNum(); i++) {
			int cellNum = sh.getRow(i).getLastCellNum();
			for (int j = 0; j < cellNum; j++) {

				// String data = sh.getRow(i).getCell(j).getStringCellValue();
				// String value = sh.getRow(i).getCell(j).getStringCellValue();

				hm.put(sh.getRow(i).getCell(j).getStringCellValue(), sh.getRow(i).getCell(++j).getStringCellValue());
			}
		}
		for (Entry<String, String> map : hm.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());

		}
		return hm;
	}
}
