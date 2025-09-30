package day40;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

//Excel File ---->Workbook---->Sheets---->Rows---->Cells
public class ReadingDataFromExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\student_records.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("sheet1"); //XSSFSheet sheet = workbook.getSheetAt(0);
        int total_rows = sheet.getLastRowNum();
        int total_cells = sheet.getRow(1).getLastCellNum();

        System.out.println("numbers of rows: " + total_rows); //5
        System.out.println("numbers of cells: " + total_cells); //4

        for (int r = 0; r <=total_rows; r++) {
            XSSFRow currentRow = sheet.getRow(r);

            for (int c = 0; c <total_cells ; c++) {
               XSSFCell cell = currentRow.getCell(c);
                System.out.print(cell.toString() +"\t");
            }
        }
        workbook.close();
        file.close();
    }
}
