package DAO;

import Connection.ConnectionFactory;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    public void gravarUsuario(String nome, String cpf, String email, String perfil, String senha){
        String insert = "INSERT INTO USUARIO(nome,cpf,email,perfil, senha)" +
                        "VALUES(?,?,?,?,?);";
        
        try {
            Usuario usuario = new Usuario();
            Connection conn = ConnectionFactory.obtemConexao();
            PreparedStatement pst = conn.prepareStatement(insert);
            
            pst.setString(1, nome);
            pst.setString(2, cpf);
            pst.setString(3, email);
            pst.setString(4, perfil);
            pst.setString(5, senha);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Usuario: \n" + nome + "\n Cadastrado com sucesso");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
