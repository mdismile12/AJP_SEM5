// resultsetmetadata , databasemetadata
import java.sql.*;
public class Jdbc3 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "#md7383";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            //Q1
            Statement stmt = con.createStatement();
            String sql1 = "USE Bank_demo";
            String sql2 = "CREATE TABLE IF NOT EXISTS bank_demo_meta (account_no INT PRIMARY KEY, Cust_name VARCHAR(50), phone_no INT,address varchar(100))";
            String tr = " Truncate bank_demo_meta";
            String query = "INSERT INTO bank_demo_meta (account_no, Cust_name, phone_no , address) VALUES (?, ?, ?, ?)";
            //Q2
            PreparedStatement pstmt = con.prepareStatement(query);
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.executeUpdate(tr);

            pstmt.setInt(1, 1001); 
            pstmt.setString(2, "Girish Bhai Patel");     
            pstmt.setInt(3,123456);
            pstmt.setString(4, "Daman");

            pstmt.addBatch();

            pstmt.setInt(1, 1002); 
            pstmt.setString(2, "V");     
            pstmt.setInt(3,123457);
            pstmt.setString(4, " Moti Daman");
            pstmt.addBatch();

            pstmt.setInt(1, 1003); 
            pstmt.setString(2, "Tom");     
            pstmt.setInt(3,1234578);
            pstmt.setString(4, " Moti Daman");
            pstmt.addBatch();

            pstmt.setInt(1, 1004); 
            pstmt.setString(2, "Jerry");     
            pstmt.setInt(3,1234576);
            pstmt.setString(4, "Vapi");
            pstmt.addBatch();

            pstmt.setInt(1, 1005); 
            pstmt.setString(2, "Tree");     
            pstmt.setInt(3,12345789);
            pstmt.setString(4, " Valsad");
            pstmt.addBatch();

            pstmt.executeBatch();
            
            System.out.println("Database created successfully!");
            System.out.println("Table created successfully!");
            System.out.println("Row Inserted");
            System.out.println("Done");
            //Q3
            String query2 = "Select * from bank_demo_meta order by account_no desc";
            PreparedStatement pstmt2 = con.prepareStatement(query2);
            ResultSet rs = null;
            rs = pstmt2.executeQuery();
            System.out.println("First five records:");
            while (rs.next()) {
                int id = rs.getInt("account_no");
                String name = rs.getString("Cust_name");
                int phno = rs.getInt("phone_no");
                String add = rs.getString("address");
                System.out.println("Account: " + id + ", Cust_name: " + name + ", phone: " + phno + ", Address: "+add);
            }
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println(rsmd.getTableName(1));
            System.out.println(rsmd.getClass());
            DatabaseMetaData dm = con.getMetaData();
            System.out.println(dm.getDatabaseProductName());
            System.out.println(dm.getDriverName());
            con.close();
        } catch (Exception msg) {
            System.out.println("Error: " + msg);
        }
    }
}