import java.io.*;

public class FileReadComp {

    public static void readFileWithFileReader(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        int data;
        while ((data = fileReader.read()) != -1) {
            System.out.print((char) data);
        }
        fileReader.close();
    }

    public static void readFileWithInputStreamReader(String filePath) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
        int data;
        while ((data = inputStreamReader.read()) != -1) {
            System.out.print((char) data);
        }
        inputStreamReader.close();
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\ayush\\Downloads\\DBMS ASSIGNMENT 5.txt";
        
        try {
            System.out.println("Reading with FileReader:");
            readFileWithFileReader(filePath);
            
            System.out.println("\n\nReading with InputStreamReader:");
            readFileWithInputStreamReader(filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

