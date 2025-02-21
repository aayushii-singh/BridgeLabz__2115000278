import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        countWords("C:\\Users\\ayush\\Desktop\\example1.txt");
    }

    static void countWords(String file) {
        Map<String, Integer> wordMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null)
                for (String word : line.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+"))
                    wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        } catch (IOException e) {}

        wordMap.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(5)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
