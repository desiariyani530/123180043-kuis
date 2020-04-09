
package pckg123180043_kuis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public Connection getDatabase() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost/hitungnilai";
        Connection kon = (Connection) DriverManager.getConnection(url, "root", "");
        return kon;
    
}
}
