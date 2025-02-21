import java.io.*;

public class CheckedExp1 {
    public static void main(String[] args) {
        readFile("data.txt");
    }

    static void readFile(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
