import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame
{
    public static void main(String [] args)
    {
        new Main();
    }

    public Main()
    {
        // create components (label and button)
        JButton button = new JButton("Testing");
        JLabel label = new JLabel("PlaceholderText");

        // set the bounds of label and button
        button.setBounds(400, 650, 200, 100);
        label.setBounds(450, 400, 200, 100);

        // set layouts of panel and frame to null
        setLayout(null);

        // configure button settings
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.WHITE);

        // configure label settings
        label.setForeground(Color.WHITE);

        // configure Frame settings
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setTitle("Window and Interaction Prototype");
        setLocationRelativeTo(null);
        setVisible(true);

        // add everything
        add(button);
        add(label);

        // setup an action listener to button
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                label.setText("You did something!");
            }
        });
    }
}