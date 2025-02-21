import java.io.*;

public class UpperToLower {
    public static void main(String[] args) {
        convertCase(
            "C:\\Users\\ayush\\Desktop\\example1.txt"
            , "C:\\Users\\ayush\\Desktop\\example2.txt"
            );
            
    }

    static void convertCase(String src, String dest) {
        try (BufferedReader br = new BufferedReader(new FileReader(src));
             BufferedWriter bw = new BufferedWriter(new FileWriter(dest))) {
            int ch;
            while ((ch = br.read()) != -1) bw.write(Character.toLowerCase(ch));
            System.out.println("Conversion done!");
        } catch (IOException e) {}
    }
}
