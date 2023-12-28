import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame
{
    public static void main(String [] args)
    {
        new Main();
    }

    public Main()
    {
        JPanel panel = new JPanel();
        JButton button = new JButton("Testing");

        panel.setBounds(0, 0, 220, 30);
        button.setBounds(400, 650, 200, 100);

        setLayout(null);
        panel.setLayout(null);

        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.BLACK);
        setTitle("Window and Interaction Prototype");
        setLocationRelativeTo(null);
        setVisible(true);

        add(panel);
        panel.add(button);
        add(button);

        panel.setLocation(0,0);
    }
}