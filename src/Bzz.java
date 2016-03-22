/**
 * Created by Donald on 25.02.2016.
 */

import javax.swing.*;
import java.awt.event.*;

public class Bzz extends JFrame {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Bzz Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);

//
        JPanel pan = new JPanel();



//        frame.getContentPane().setLayout(null);
        Bzz2 bzz2 = new Bzz2();
        JButton button = new JButton("Open second window");
//        button.setLocation(100, 100);
//        button.addActionListener(bzz2);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                System.out.println("You clicked the button");

                Bzz2 bzz2 = new Bzz2();
                bzz2.createUI();
            }
        });


        JLabel label = new JLabel("Bzz Label");
        pan.add(label);
        label.setBounds(100, 100, 100, 100 );



        pan.setLayout(null);

        pan.add(button);

        button.setBounds(100, 200, 200, 100);



        frame.getContentPane().add(pan);
        frame.setSize(400, 400);
//        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
