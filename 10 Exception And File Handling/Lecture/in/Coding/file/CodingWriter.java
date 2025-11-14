package in.Coding.file;

import java.io.FileWriter;
import java.io.IOException;

public class CodingWriter {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        try(FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is the best home.\n");
            for(int i = 0; i< 1000; i++){
                writer.write('*');
            }
            writer.flush();
            System.out.println("File Written successfully");
        } catch (IOException exception) {
            System.out.printf("Exception occurred %s\n",
                    exception.getMessage());

        }
        }
    }
