import javax.swing.*;

public class PicnicAnalyzerApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Виртуальный пикник");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new PicnicAnalyzerPanel());
            frame.pack();
            frame.setVisible(true);
        });
    }
}
