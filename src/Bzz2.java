/**
 * Created by Donald on 25.02.2016.
 */

import javax.swing.*;
//import java.awt.event.*;

public class Bzz2 extends JFrame /* implements ActionListener */{
    public void createUI() {
        this.setSize(100, 100);
        JLabel label = new JLabel("(c) Duffy 2016");
        this.add(label);
        this.setVisible(true);
    }

//    public void actionPerformed(ActionEvent e) {
//        Bzz2 bzz2 = new Bzz2();
//        bzz2.createUI();
//    }
}
