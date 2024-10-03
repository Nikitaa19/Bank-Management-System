package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class MiniStatement extends JFrame {
    
    MiniStatement(String pinnumber) {
        setTitle("Mini Statement");
        
        setLayout(null);
        
        JLabel text = new JLabel();
        add(text);
        
        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 100, 20);
        add(bank);
        
        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);
        
        try {
            Conn conn = new Conn();
            conn.s.executeQuery("select * from login where pin = ")
        } catch (Exception e) {
            System.out.println(e);
        }
        
        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String args[]) {
        new MiniStatement();
    }
    
}
