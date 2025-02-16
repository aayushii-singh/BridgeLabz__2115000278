import java.io.*;
public class InputStreamReaderQ {
    public static void main(String[] args) throws IOException {
        String text = "Helllo, Ayushi This Side";
        ByteArrayInputStream bais = new ByteArrayInputStream(text.getBytes("UTF-8"));
        BufferedReader br = new BufferedReader(new InputStreamReader(bais, "UTF-8"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
