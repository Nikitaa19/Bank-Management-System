package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class MiniStatement extends JFrame {
    
    MiniStatement() {
        setTitle("Mini Statement");
        
        setLayout(null);
        
        JLabel text = new JLabel();
        add(text);
        
        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 100, 20);
        add(bank);
        
        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String args[]) {
        new MiniStatement();
    }
    
}
