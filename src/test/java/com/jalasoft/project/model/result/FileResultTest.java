package com.jalasoft.project.model.result;

import com.jalasoft.project.common.exception.InvalidDataException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileResultTest {
    private static final String FILEPATH = "files/test.txt";

    @Test
    public void writeToFileWithNullData() throws InvalidDataException {
        FileResult fileResult = new FileResult();
        String message = fileResult.writeToFile(null);
        System.out.println(message);
        assertEquals("An error occurred.", message);
    }

    @Test
    public void writeToFileWithEmptyData() throws InvalidDataException {
        FileResult fileResult = new FileResult();
        String message = fileResult.writeToFile("");
        System.out.println(message);
        assertEquals("An error occurred.", message);
    }
}