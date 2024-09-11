//package bank.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    public Conn() {
        try {
            //Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "8Vb&8Ih$");
            s = c.createStatement();

        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
