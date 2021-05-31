
package DAO;

import Classes.ConnectionFactory;
import Classes.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UsuarioDAO{
    
    public boolean existe(Usuario usuario){
        
        String sql = "SELECT * FROM usuario WHERE cpf = ?" + 
                " AND senha = ? ";
        
        try{
         
            Connection conn = ConnectionFactory.obtemConexao();
            
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, usuario.getCpf());
            pst.setString(2, usuario.getSenha());
            
            
            //Executando o comando 'SELECT'
            //e recebendo o retorno:
            ResultSet resultado = pst.executeQuery();
            
            return resultado.next();
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
}


