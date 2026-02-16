
package persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author formando
 */
public class DBWorker {
    
    private static String URL =
        "jdbc:mysql://62.28.39.135:3306/efa0125_15_wanderpark";
    private static String USER = "efa0125";
    private static String PASSWORD = "123.Abc";



     public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    
     public void Desconnection() throws SQLException{
        DriverManager.getConnection(URL, USER, PASSWORD).close();
     }
     

}

