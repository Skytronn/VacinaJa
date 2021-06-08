package DAO;

import Connection.ConnectionFactory;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RelatorioDAO {
    
    public void calculoSoma(){
        
    }
    
    public int primeiraSoma(){
        int primeiraSoma = 0;
        
        try {
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("SELECT SUM(idade) AS total FROM paciente where idade >= 90;"); 
           
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           primeiraSoma = rs.getInt("idade");
           
           return primeiraSoma;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(primeiraSoma == 0){
            System.out.println("erro");
        }
        return primeiraSoma;
    }
        public int segundaSoma(){
        int segundaSoma = 0;
        
        try {
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("SELECT SUM(idade) AS total FROM paciente where 70 <= idade < 90;"); 
           
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           segundaSoma = rs.getInt("idade");
           
           return segundaSoma;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(segundaSoma == 0){
            System.out.println("erro");
        }
        return segundaSoma;
    }
        public int terceiraSoma(){
        int terceiraSoma = 0;
        
        try {
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("SELECT SUM(idade) AS total FROM paciente where 70 > idade >= 50;"); 
           
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           terceiraSoma = rs.getInt("idade");
           
           return terceiraSoma;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(terceiraSoma == 0){
            System.out.println("erro");
        }
        return terceiraSoma;
    }
        public int quartaSoma(){
        int quartaSoma = 0;
        
        try {
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("SELECT SUM(idade) AS total FROM paciente where idade < 50;"); 
           
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           quartaSoma = rs.getInt("idade");
           
           return quartaSoma;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(quartaSoma == 0){
            System.out.println("erro");
        }
        return quartaSoma;
    }
        
        public int primeiraQuantidade(){
           int primeiraQuantidade = 0;
           
           try {
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("Select count(idade) from paciente where 70 <= idade < 90;;"); 
           
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           primeiraQuantidade = rs.getInt("idade");
           
           return primeiraQuantidade;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(primeiraQuantidade == 0){
            System.out.println("erro");
        }
        return primeiraQuantidade;
        }
        
    public int segundaQuantidade(){
           int segundaQuantidade = 0;
           
           try {
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("Select count(idade) from paciente where 70 <= idade < 90;"); 
           
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           segundaQuantidade = rs.getInt("idade");
           
           return segundaQuantidade;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(segundaQuantidade == 0){
            System.out.println("erro");
        }
        return segundaQuantidade;
        }
    public int terceiraQuantidade(){
           int terceiraQuantidade = 0;
           
           try {
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("Select count(idade) from paciente where 70 > idade >= 50;"); 
           
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           terceiraQuantidade = rs.getInt("idade");
           
           return terceiraQuantidade;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(terceiraQuantidade == 0){
            System.out.println("erro");
        }
        return terceiraQuantidade;
        }
    public int quartaQuantidade(){
           int quartaQuantidade = 0;
           
           try {
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("Select count(idade) from paciente where idade < 50;"); 
           
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           quartaQuantidade = rs.getInt("idade");
           
           return quartaQuantidade;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(quartaQuantidade == 0){
            System.out.println("erro");
        }
        return quartaQuantidade;
        }
}
