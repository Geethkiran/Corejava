package com.OpenCsv.java;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class OpenCSVWriter {
    private static final String OBJECT_WRITE_FILE_PATH = "C:\\Users\\Ucantseeme\\Desktop\\git content\\filename.csv";

    public static void main(String[] args) throws IOException {
        try (
                Writer writer = Files.newBufferedWriter(Paths.get(OBJECT_WRITE_FILE_PATH));
        ) {
            StatefulBeanToCsv<CSVUser> beanToCsv = new StatefulBeanToCsvBuilder(writer).withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).build();
            List<CSVUser> csvUsers = new ArrayList<>();
            csvUsers.add(new CSVUser("geeth","geeth@gmail.com","9999044999","India"));
            csvUsers.add(new CSVUser("kiran","geethkiran@gmail.com","90699989891","India"));
            csvUsers.add(new CSVUser("karthik","karthik@gmail.com","9302878891","India"));
            csvUsers.add(new CSVUser("vamsi","karthikvamsi@gmail.com","9018783891","India"));
            beanToCsv.write(csvUsers);
        } catch (CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        } catch (CsvDataTypeMismatchException e) {
            e.printStackTrace();
        }

    }
}