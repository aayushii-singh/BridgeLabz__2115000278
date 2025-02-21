import java.io.*;

public class ImageByteArray {
    public static void main(String[] args) {
        byte[] data = readImage("input.jpg");
        if (data != null) writeImage("output.jpg", data);
    }

    static byte[] readImage(String file) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) baos.write(buffer, 0, bytesRead);
            return baos.toByteArray();
        } catch (IOException e) {
            return null;
        }
    }

    static void writeImage(String file, byte[] data) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             FileOutputStream fos = new FileOutputStream(file)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) fos.write(buffer, 0, bytesRead);
            System.out.println("Image copied!");
        } catch (IOException e) {}
    }
}
