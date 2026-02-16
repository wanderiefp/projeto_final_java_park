
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author formando
 */
public class DBWorker {
    
private static final String URL =
        "jdbc:mysql://62.28.39.135:62444/efa0125_15_WanderPark?useSSL=false&serverTimezone=UTC";
private static final String USER = "efa0125";
private static final String PASSWORD = "efa0125@";



     public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }


}

