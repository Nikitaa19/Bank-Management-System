package bank.management.system;

import javax.swing.*;

public class MiniStatement extends JFrame {
    
    MiniStatement() {
        setTitle("Mini Statement");
        
        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String args[]) {
        new MiniStatement();
    }
    
}
