import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mariadb implements Database{
    public Connection connectDb() {
        Connection con = null;
        try {
            con = tryConnectDb();
        } catch (Exception e) {
            System.err.println("Hiba! Nem lehet csatlakozni.");
        }
        return con;
    }

    public Connection tryConnectDb() throws SQLException{
        String url = "jb:mariadb://localhost:3306/adaba";
        String user = "adaba";
        String pass = "titok";
        return DriverManager.getConnection(url, user, pass);
        
    }   


    public void closeDb(Connection con) {

    }    
}
