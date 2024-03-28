import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class WordFrequencyCalculator {
    public static void calculateWordFrequency(String fileName) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }
            StringBuilder message = new StringBuilder("Частота слов в файле:\n");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                message.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
            // Вывод результата
            JOptionPane.showMessageDialog(null, message.toString(), "Частота слов", JOptionPane.PLAIN_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
