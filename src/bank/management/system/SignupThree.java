package bank.management.system;

import javax.swing.*;

public class SignupThree extends JFrame {
    
    SignupThree() {
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }
    
    public static void main(String args[]) {
        new SignupThree();
    }
    
}
