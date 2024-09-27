package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BalanceEnquiry extends JFrame implements ActionListener {
    
    JButton back;
    String pinchange;
    
    BalanceEnquiry(String pinchange) {
        
        this.pinchange = pinchange;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pinchange).setVisible(true);
    }
    
    public static void main(String args[]) {
        new BalanceEnquiry("");
    }
    
}
