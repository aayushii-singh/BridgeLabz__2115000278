import java.io.*;

public class FileCopyBuffered {
    public static void main(String[] args) {
        copyFile("largefile.txt", "copy.txt");
    }

    public static void copyFile(String src, String dest) {
        long start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) bos.write(buffer, 0, bytesRead);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Time: " + (System.nanoTime() - start) + " ns");
    }
}
