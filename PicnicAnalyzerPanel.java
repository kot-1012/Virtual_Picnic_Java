import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PicnicAnalyzerPanel extends JPanel {
    private JButton countWordsButton;
    private JButton findLongestWordButton;
    private JButton calculateWordFrequencyButton;

    public PicnicAnalyzerPanel() {
        setLayout(new GridLayout(3, 1));

        countWordsButton = new JButton("Осуществить подсчет слов");
        findLongestWordButton = new JButton("Найти самое длинное слово");
        calculateWordFrequencyButton = new JButton("Вычислить частоту слов");

        add(countWordsButton);
        add(findLongestWordButton);
        add(calculateWordFrequencyButton);

        countWordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WordCounter.countWords("input.txt");
            }
        });

        findLongestWordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LongestWordFinder.findLongestWord("input.txt");
            }
        });

        calculateWordFrequencyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WordFrequencyCalculator.calculateWordFrequency("input.txt");
            }
        });
    }
}
