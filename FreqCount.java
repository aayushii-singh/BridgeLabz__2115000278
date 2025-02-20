import java.util.*;
public class FreqCount{
    
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String,Integer> freqMap= new HashMap<>();
        for(String temp:words){
            if(freqMap.containsKey(temp)){
                freqMap.put(temp,freqMap.get(temp)+1);
                }
                else{
                    freqMap.put(temp,1);
           
        }
    }
        System.out.println(freqMap);
}}

