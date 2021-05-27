package com.vacinaja.vacina;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private String usuario = "root";
    private String senha = "12345";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "VacinaJa";

    public Connection obtemConexao() {
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
