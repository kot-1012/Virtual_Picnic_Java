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
                // Удаляем начальные и конечные пробелы из строки
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Находим самое длинное слово
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            // Вывод результата
            JOptionPane.showMessageDialog(null, "Самое длинное слово в файле: " + longestWord, "Длинное слово", JOptionPane.PLAIN_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
