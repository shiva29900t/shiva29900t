import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
    public static void main(String[] args) {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/kavya"; // replace "mydatabase" with your DB name
        String user = "root"; // your DB username
        String password = "pcell"; // your DB password

        Connection conn = null;

        try {
            // Establish connection
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Connected to the database!");
            }
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database");
            e.printStackTrace();
        } finally {
            // Close connection
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}