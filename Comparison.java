import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class Comparison {
    public static void main(String[] args) throws Exception {
        int n = 1000000;
        String str = "hello";
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(str);
        long timeSB = System.nanoTime() - start;
        
        start = System.nanoTime();
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) sBuffer.append(str);
        long timeSBuffer = System.nanoTime() - start;
        
        System.out.println("StringBuilder: " + timeSB + " ns");
        System.out.println("StringBuffer: " + timeSBuffer + " ns");
        
        start = System.nanoTime();
        BufferedReader br1 = new BufferedReader(new FileReader("largefile.txt"));
        int count1 = 0;
        String line;
        while ((line = br1.readLine()) != null)
            count1 += line.split("\\s+").length;
        br1.close();
        long timeFR = System.nanoTime() - start;
        
        start = System.nanoTime();
        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("largefile.txt"), "UTF-8"));
        int count2 = 0;
        while ((line = br2.readLine()) != null)
            count2 += line.split("\\s+").length;
        br2.close();
        long timeISR = System.nanoTime() - start;
        
        System.out.println("FileReader count: " + count1 + ", " + timeFR + " ns");
        System.out.println("InputStreamReader count: " + count2 + ", " + timeISR + " ns");
    }
}

