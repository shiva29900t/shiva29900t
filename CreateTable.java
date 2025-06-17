import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class CreateTable {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/kavya";
        String dbUser = "root";
        String dbPassword = "pcell";
        String createTableSQL = """
            CREATE TABLE users (
                id INT PRIMARY KEY,
                name VARCHAR(100),
                email VARCHAR(100)
            )
            """;
        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            System.out.println("Connected to the database.");

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute the CREATE TABLE SQL
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'users' created successfully.");

            // Close the connection
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}