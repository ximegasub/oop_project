package com.jalasoft.project.model.result;

import com.jalasoft.project.common.exception.InvalidDataException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileResult {
    private static final String FILEPATH = "files/data.txt";


    public String writeToFile(String data){

        String message = "";
        try {
            if (data == null || data.isEmpty()) {
                throw new InvalidDataException();
            }
            File file = new File(FILEPATH);
            FileWriter myWriter = new FileWriter(FILEPATH, true);
            myWriter.write("\n");
            myWriter.write(data);
            myWriter.write("\n");
            myWriter.close();
            message = "Successfully wrote to the file.";
            return message;
        } catch (IOException | InvalidDataException e) {
            message = "An error occurred.";
            e.printStackTrace();
        } finally {
            return message;
        }
    }
}

