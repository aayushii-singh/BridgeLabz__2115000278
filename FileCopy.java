import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("source.txt");
             FileOutputStream fos = new FileOutputStream("destination.txt")) {
            int b;
            while ((b = fis.read()) != -1) fos.write(b);
            System.out.println("Copy done.");
        } catch (FileNotFoundException e) {
            System.out.println("Source file missing.");
        } catch (IOException e) {
            System.out.println("Error in file operation.");
        }
    }
}
