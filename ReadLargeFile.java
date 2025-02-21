import java.io.*;

public class ReadLargeFile {
    public static void main(String[] args) {
        readErrors("C:\\Users\\ayush\\Desktop\\example1.txt");
    }

    static void readErrors(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null)
                if (line.toLowerCase().contains("error")) System.out.println(line);
        } catch (IOException e) {}
    }
}
