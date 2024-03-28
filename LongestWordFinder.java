import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LongestWordFinder {
    public static void findLongestWord(String fileName) {
        String longestWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Самое длинное слово в файле: " + longestWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
