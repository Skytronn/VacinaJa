
package DAO;

import Model.Usuario;

import Connection.ConnectionFactory;
import Model.Login;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO{
    
    public boolean check(String cpf, String senha){
        boolean check = false;
        
        try{
           Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("SELECT * FROM usuario where cpf = ? AND senha = ?"); 
           
           pst.setString(1, cpf);
           pst.setString(2, senha);
           
           //o cpf e senha estão armazenados aqui para podermos fazer o if abaixo
           ResultSet rs = pst.executeQuery();
          
           if(rs.next()){
               
               check = true;
   
           }
           
            return check;
        }
        catch(Exception ex){
            ex.printStackTrace();
            check = false;
            return check;
        }
    }
        public String Perfil(String cpf){
        String perfil = "perfil";
        
        
        
        try{
            Connection conn = ConnectionFactory.obtemConexao();
           PreparedStatement pst = conn.prepareStatement("SELECT * FROM usuario where cpf = ?"); 
           
           pst.setString(1, cpf);

           ResultSet rs = pst.executeQuery();
           
           rs.first();
           perfil = rs.getString(perfil);
           
            return perfil;
        }
        catch(Exception ex){
            ex.printStackTrace();
            
        }
        return perfil;
    }
   
}
