package sql1;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost";
        String user = "root";
        String pw = "";
        // Exception Handling
        try{
            Connection con = DriverManager.getConnection(url, user, pw);
            Statement stm =con.createStatement();
            stm.execute("CREATE DATABASE IF NOT EXISTS javadb");
            stm.execute("USE javadb");
            stm.execute("CREATE TABLE IF NOT EXISTS car (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "brand VARCHAR(50)," +
                            "model VARCHAR(50)," +
                        "hp INT)"
                        );
            stm.execute("INSERT INTO car (brand, model, hp) VALUES" +
                    "('VW', 'Caddy', 150)");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}