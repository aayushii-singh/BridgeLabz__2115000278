import java.io.*;
import java.util.*;

public class WrdFreqCount {
    public static void main(String[] args) throws IOException {
        String text = "Hello world, hello Java!";
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        
        Map<String, Integer> freq = new HashMap<>();
        for (String word : text.split("\\s+")) 
            freq.put(word, freq.getOrDefault(word, 0) + 1);

        System.out.println(freq);
    }
}
