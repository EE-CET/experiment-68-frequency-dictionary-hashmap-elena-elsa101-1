import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class FrequencyDictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the entire line of input
        if (!sc.hasNextLine()) {
            return;
        }
        String input = sc.nextLine();
        
        // Split the string into words based on whitespace
        String[] words = input.split("\\s+");
        
        // Use a HashMap to store word frequencies
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        
        for (String word : words) {
            // Ignore empty strings if there are multiple spaces
            if (word.isEmpty()) continue;
            
            // Update the count in the map
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        // Print the output in the format "Word: Count"
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        sc.close();
    }
}
