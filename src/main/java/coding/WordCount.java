package coding;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "This is a sample input string. This string contains repeated words like is, this, and string.";
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the input string into words
        String[] words = inputString.split("\\s+");

        // Count the occurrences of each word
        for (String word : words) {
            // Remove punctuation marks from the word
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // If the word is empty after removing punctuation marks, continue to the next word
            if (word.isEmpty()) {
                continue;
            }

            // Update the count of the word in the map
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Print the count of each word
        System.out.println("Count of each word:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

