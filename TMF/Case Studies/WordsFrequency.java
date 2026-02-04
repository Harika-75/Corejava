package collections;
import java.util.*;
public class WordsFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String sentence = "java is easy and java is powerful";

	        
	        String[] words = sentence.split(" ");

	   
	        Map<String, Integer> wordCountMap = new LinkedHashMap<>();

	        for (String word : words) {
	            wordCountMap.put(
	                word,
	                wordCountMap.getOrDefault(word, 0) + 1
	            );
	        }

	        
	        System.out.println("Word Frequency:");
	        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }

	
	        String mostFrequentWord = null;
	        int maxCount = 0;

	        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                maxCount = entry.getValue();
	                mostFrequentWord = entry.getKey();
	            }
	        }

	        System.out.println("\nMost Frequent Word:");
	        System.out.println(mostFrequentWord + " -> " + maxCount);
	}

}
