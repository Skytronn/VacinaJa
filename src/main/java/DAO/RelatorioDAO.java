package DAO;

import Connection.ConnectionFactory;
import Model.Relatorio;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RelatorioDAO {
    
    public int primeiraSoma(String iniciosql, String fimsql){
        int primeiraSoma = 0;
        System.out.println("Primeira soma");
        Relatorio rel = new Relatorio();       
        
//        String iniciosql = rel.getDataInicio();
//        String fimsql = rel.getDataFim();
//        System.out.println(rel.getDataInicio());
//        System.out.println(rel.getDataInicio());
        
        String select = "SELECT SUM(idade) AS total FROM paciente where idade >= 90 and dataVacinacao >= ? and dataVacinacao <= ?;";
        
        
        try {
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement(select);
           
           pst.setString(1, iniciosql);
           pst.setString(2, fimsql);
           
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           primeiraSoma = rs.getInt("total");
           System.out.println("primeira soma "+primeiraSoma);
           pst.close();
           return primeiraSoma;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return primeiraSoma;
    }
    
        public int segundaSoma(String iniciosql, String fimsql){
        int segundaSoma = 0;
        Relatorio rel = new Relatorio();
        
        try {
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("SELECT SUM(idade) AS total FROM paciente where 70 <= idade < 90 and dataVacinacao >= ? and dataVacinacao <= ?;"); 
           
           pst.setString(1, iniciosql);
           pst.setString(2, fimsql);
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           segundaSoma = rs.getInt("total");
            System.out.println("segunda soma"+segundaSoma);
           return segundaSoma;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(segundaSoma == 0){
            System.out.println("erro");
        }
            
        return segundaSoma;
    }
        
        public int terceiraSoma(String iniciosql, String fimsql){
        int terceiraSoma = 0;
        Relatorio rel = new Relatorio();
        
        try {
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("SELECT SUM(idade) AS total FROM paciente where idade >= 50 and idade < 70 and dataVacinacao >= ? and dataVacinacao <= ?;"); 
           pst.setString(1, iniciosql);
           pst.setString(2, fimsql);
           
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           terceiraSoma = rs.getInt("total");
           System.out.println("terceira soma"+terceiraSoma);
           return terceiraSoma;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(terceiraSoma == 0){
            System.out.println("erro");
        }
            
        return terceiraSoma;
    }
        
        public int quartaSoma(String iniciosql, String fimsql){
        int quartaSoma = 0;
        Relatorio rel = new Relatorio();
        
        try {
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("SELECT SUM(idade) AS total FROM paciente where idade < 50 and dataVacinacao >= ? and dataVacinacao <= ?;"); 
           
           pst.setString(1, iniciosql);
           pst.setString(2, fimsql);
           
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           quartaSoma = rs.getInt("total");
           System.out.println("quarta soma "+quartaSoma);
           return quartaSoma;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(quartaSoma == 0){
            System.out.println("erro");
        }
            
        return quartaSoma;
    }
        
        public int primeiraQuantidade(String iniciosql, String fimsql){
           int primeiraQuantidade = 0;
           Relatorio rel = new Relatorio();
           
           try {
               System.out.println(iniciosql + "  " + fimsql);
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("Select count(idade) from paciente where idade >= 90 and dataVacinacao >= ? and dataVacinacao <= ?;"); 
           
           pst.setString(1, iniciosql);
           pst.setString(2, fimsql);
           
           ResultSet rs = pst.executeQuery();
           
           rs.first();
           primeiraQuantidade = rs.getInt("count(idade)");
               System.out.println("primeira quantidade " + primeiraQuantidade);
               
           if(primeiraQuantidade == 0){
               System.out.println("erro por divisão por zero 1 qtd");
           }
           return primeiraQuantidade;
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return primeiraQuantidade;
        }
        
        public int segundaQuantidade(String iniciosql, String fimsql){
               int segundaQuantidade = 0;

               Relatorio rel = new Relatorio();
               
               try {
               Connection conn = ConnectionFactory.obtemConexao();
               PreparedStatement pst = conn.prepareStatement("Select count(idade) from paciente where 70 <= idade < 90 and dataVacinacao >= ? and dataVacinacao <= ?;"); 
               
               pst.setString(1, iniciosql);
               pst.setString(2, fimsql);
               ResultSet rs = pst.executeQuery();

               rs.first();
               segundaQuantidade = rs.getInt("count(idade)");
               if(segundaQuantidade == 0){
                    System.out.println("erro por divisão por 0 segunda quantidade");
               }
            System.out.println("segunda qtd "+segundaQuantidade);
               return segundaQuantidade;

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            return segundaQuantidade;
            }
        public int terceiraQuantidade(String iniciosql, String fimsql){
               int terceiraQuantidade = 0;
               Relatorio rel = new Relatorio();
               
               try {
               Connection conn = ConnectionFactory.obtemConexao();
               PreparedStatement pst = conn.prepareStatement("Select count(idade) from paciente where idade >= 50 and idade < 70 and dataVacinacao >= ? and dataVacinacao <= ?;"); 
               pst.setString(1, iniciosql);
               pst.setString(2, fimsql);
               ResultSet rs = pst.executeQuery();

               rs.first();
               terceiraQuantidade = rs.getInt("count(idade)");
                if(terceiraQuantidade == 0){
                    System.out.println("erro divisão por 0 terceida qtd");
                }
                System.out.println("terceida qtd "+terceiraQuantidade);
               return terceiraQuantidade;

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            return terceiraQuantidade;
            }
        public int quartaQuantidade(String iniciosql, String fimsql){
               int quartaQuantidade = 0;
               Relatorio rel = new Relatorio();
               
                try {
               Connection conn = ConnectionFactory.obtemConexao();
               PreparedStatement pst = conn.prepareStatement("Select count(idade) from paciente where idade < 50 and dataVacinacao >= ? and dataVacinacao <= ?;"); 
               pst.setString(1, iniciosql);
               pst.setString(2, fimsql);
               ResultSet rs = pst.executeQuery();

               rs.first();
               quartaQuantidade = rs.getInt("count(idade)");
               if(quartaQuantidade == 0){
                System.out.println("Erro divisão por 0 ");
               }
            System.out.println("quarta qtd "+quartaQuantidade);
               return quartaQuantidade;

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            return quartaQuantidade;
            }
}
