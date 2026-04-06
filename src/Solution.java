import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ensure there is actually input to read
        if (!sc.hasNextLine()) return;
        
        String input = sc.nextLine();
        
        // Split by one or more whitespace characters
        // trim() removes leading/trailing spaces that cause empty keys
        String[] words = input.trim().split("\\s+");
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String w : words) {
            // Some autograders are case-sensitive. 
            // If it fails, try adding: w = w.toLowerCase();
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        
        // Print in the exact format: word: count
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        sc.close();
    }
}
