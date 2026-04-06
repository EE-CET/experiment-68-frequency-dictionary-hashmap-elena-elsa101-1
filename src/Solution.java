import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read a single line of text
        if (!scanner.hasNextLine()) {
            return;
        }
        String line = scanner.nextLine();
        
        // TODO: Split the text into individual words
        // Using \\s+ handles multiple spaces between words
        String[] words = line.trim().split("\\s+");
        
        // TODO: Create a HashMap to store the frequency of each word
        HashMap<String, Integer> wordCounts = new HashMap<>();
        
        // TODO: Iterate through the words and update their frequencies in the map
        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        
        // TODO: Iterate through the map and print the unique words and their counts
        // Format: "word: count"
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}
