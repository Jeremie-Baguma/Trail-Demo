//Count Word Frequencies Using Map
//Write a program that:
//-Accepts a sentence as input.
//-Splits the sentence into words and stores each word's frequency in a HashMap.
//-Prints the word frequencies

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Create a scanner to accept user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequencies = new HashMap<>();

        // Loop through each word
        for (String word : words) {
            word = word.toLowerCase();  // Convert word to lowercase for case-insensitive counting
            wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
        }

        // Print the word frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Close the scanner
        scanner.close();
    }
}
