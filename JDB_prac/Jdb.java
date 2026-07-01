import java.sql.*;
public class Jdb {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "#md7383";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            String sql = "CREATE DATABASE Bank_demo if not exits";
            String sql1 = "USE Bank_demo";
            String sql2 = "CREATE TABLE student (id INT PRIMARY KEY, name VARCHAR(50), age INT)";
            String sql3 = "INSERT INTO STUDENT VALUES(1,'MD ISMILE',20)";
            String sql4 = "INSERT INTO STUDENT VALUES(2,'Vutti',21)";
            
            stmt.executeUpdate(sql);
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.executeUpdate(sql3);
            stmt.executeUpdate(sql4);

            System.out.println("Database created successfully!");
            System.out.println("Table created successfully!");
            System.out.println("Row Inserted");
            System.out.println("Done");
            
            con.close();
        } catch (Exception msg) {
            System.out.println("Error: " + msg);
        }
    }
}
