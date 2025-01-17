package classification;

import java.io.*;

public class javaio {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // 寫入檔案
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, Java IO!\nThis is a test file.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // 讀取檔案
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
