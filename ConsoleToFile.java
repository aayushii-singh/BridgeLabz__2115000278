import java.io.*;
public class ConsoleToFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("output.txt");
        String line;
        while (!(line = br.readLine()).equals("exit")) {
            fw.write(line + "\n");
        }
        fw.close();
        br.close();
    }
}
