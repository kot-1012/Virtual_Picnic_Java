 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class WordCounter {
    public static void countWords(String fileName) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Используем регулярное выражение для разделения слов по любому количеству пробельных символов
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Проверяем, что слово не пустое (после нескольких пробелов могут быть пустые строки)
                    if (!word.isEmpty()) {
                        count++;
                    }
                }
            }
            // Вывод результата
            JOptionPane.showMessageDialog(null, "Количество слов в файле: " + count, "Кол-во слов в файле", JOptionPane.PLAIN_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
