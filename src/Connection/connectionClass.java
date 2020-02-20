package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionClass {
      Connection connection = null;
    public Connection getConnection() throws SQLException {
        String dbname = "online_shop";
        String userName = "root";
        String pass = "";
        try {
           // Class.forName("com.mysql.jdbc.Driver");
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/"+dbname+"?useLegacyDatetimeCode=false&serverTimezone=America/New_York", userName, pass);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();


        }
        return connection;
        }
}
