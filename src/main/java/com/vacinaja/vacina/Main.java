package com.vacinaja.vacina;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.vacinaja.vacina.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        //('Joao',70,1,'Caixa 12, Praça da Sé')
        //Inserir
        
        String nome,endereco;
        boolean area_saude = true;
        int idade = 74;
        
        nome = "João";
        endereco = "Caixa 12 Praça da Sé";
        
        String sql = "INSERT INTO PACIENTE(nome, idade, area_saude, endereco)\n" +
"			VALUES(?,?,?,?)";
       //Conexão
       ConnectionFactory factory = new ConnectionFactory();
       
       try(Connection con = factory.obtemConexao()){
           PreparedStatement pst = con.prepareStatement(sql);
           
           pst.setString(1, nome);
           pst.setInt(2, idade);
           pst.setBoolean(3, area_saude);
           pst.setString(4, endereco);
           
           pst.execute();
       }
       catch(Exception ex){
           System.out.println("Conexão falhou");
           ex.printStackTrace();
       }
    }     
}
