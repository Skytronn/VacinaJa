package Classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static String usuario = "root";
    private static String senha = "12345";
    private static String host = "localhost";
    private static String porta = "3306";
    private static String bd = "vacinaja";

    public static Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLagacyDatetimeCode=false&serverTimezone=UTC",
                    usuario,
                    senha
            );
            return c;
        } 
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
