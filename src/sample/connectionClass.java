package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionClass {
    private static connectionClass instance = new connectionClass();


    private connectionClass() {

    }
    public static connectionClass getInstance() {
        return instance;
    }
      Connection connection = null;
    public Connection getConnection(){
        Connection connection;
        String dbName = "online_shop";
        String user="root";
        String pass ="";

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/"+dbName +"?useLegacyDatetimeCode=false&serverTimezone=America/New_York", user, pass); //tu specifikovat aj port!! v skole asi 3308
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

