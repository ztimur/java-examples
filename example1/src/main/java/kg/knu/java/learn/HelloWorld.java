package kg.knu.java.learn;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        System.out.println("Arg[0]=" + args[0]);

        Workbook book = WorkbookFactory.create(Files.newInputStream(Paths.get(args[0])));

        Sheet sheet = book.getSheetAt(0);

        Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.iterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                System.out.printf("%d %d %s\n", row.getRowNum(), cell.getColumnIndex(), cell);
            }
        }

    }
}