import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
        JLabel label = new JLabel("PlaceholderText", SwingConstants.CENTER);

        // set the bounds of label and button
        button.setBounds(660, 650, 200, 100);
        label.setBounds(660, 400, 200, 100);

        // set layouts of panel and frame to null
        setLayout(null);

        // configure button settings
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.GRAY);
        button.setFocusPainted(false);

        // configure label settings
        label.setForeground(Color.GRAY);
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);
        label.setVerticalAlignment(SwingConstants.TOP);

        // configure Frame settings
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
        setTitle("Window and Interaction Prototype");
        setLocationRelativeTo(null);
        setVisible(true);

        // add everything
        add(button);
        add(label);

        // setup an action listener to button
        button.addActionListener(new ActionListener(){
            public int count = 0;
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(count % 5 == 0)
                {
                    label.setText("<html> You did something! Line: " + count + "<html>");
                }
                else
                {
                    label.setText("<html>" + label.getText() + "<br>You did something! Line: " + count + "<html>");
                }
                count++;
            }
        });
    }
}