import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileWordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String target = "ayushi";
        int count = 0;
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                if (words[i].equalsIgnoreCase(target)) {
                    count++;
                }
            }
        }
        br.close();
        System.out.println("Count of 'ayushi': " + count);
    }
}
