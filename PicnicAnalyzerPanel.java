import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PicnicAnalyzerPanel extends JPanel {
    private JButton countWordsButton;
    private JButton findLongestWordButton;
    private JButton calculateWordFrequencyButton;

    public PicnicAnalyzerPanel() {
        setLayout(new GridLayout(3, 1)); // Устанавливаем сетку для размещения кнопок

        // Создаем кнопки для различных действий
        countWordsButton = new JButton("Осуществить подсчет слов");
        findLongestWordButton = new JButton("Найти самое длинное слово");
        calculateWordFrequencyButton = new JButton("Вычислить частоту слов");

        // Добавляем кнопки на панель
        add(countWordsButton);
        add(findLongestWordButton);
        add(calculateWordFrequencyButton);

        // Добавляем обработчики событий для кнопок
        countWordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WordCounter.countWords("input.txt"); // Вызываем метод подсчета слов при нажатии кнопки
            }
        });

        findLongestWordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LongestWordFinder.findLongestWord("input.txt"); // Вызываем метод поиска самого длинного слова при нажатии кнопки
            }
        });

        calculateWordFrequencyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WordFrequencyCalculator.calculateWordFrequency("input.txt"); // Вызываем метод вычисления частоты слов при нажатии кнопки
            }
        });
    }
}
