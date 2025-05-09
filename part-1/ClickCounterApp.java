import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickCounterApp extends JFrame implements ActionListener {
    private JLabel counterLabel;    // Displays the click count
    private JButton clickButton;    // Button to register clicks
    private int count = 0;          // Stores the current count

    public ClickCounterApp() {
        setTitle("Salavat shomare ghavi");
        counterLabel = new JLabel("Salavat ha: 0", SwingConstants.CENTER);
        clickButton = new JButton("Yedoone ferestadam ");
        clickButton.addActionListener(this);

        setLayout(new BorderLayout());
        add(counterLabel, BorderLayout.CENTER);
        add(clickButton, BorderLayout.SOUTH);

        getContentPane().setBackground(Color.GREEN);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        counterLabel.setText("Salavat ha : " + count);
    }

    public static void main(String[] args) {
        ClickCounterApp app = new ClickCounterApp();
        app.setVisible(true);
    }

}
