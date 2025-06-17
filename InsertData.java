import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertData {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/kavya";
        String dbUser = "root";
        String dbPassword = "pcell";
        String insertSQL = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            System.out.println("Database connected successfully.");
            PreparedStatement statement = connection.prepareStatement(insertSQL);
            statement.setInt(1, 1);
            statement.setString(2, "John Doe");
            statement.setString(3, "john.doe@example.com");
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}