package DAO;

import Connection.ConnectionFactory;
import Model.Usuario;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
    
    
    //metodo para buscar a lista de usuarios no banco
    public List<Usuario> lerUsuarios(){
        Connection conn = ConnectionFactory.obtemConexao();
        PreparedStatement pst = null;
        List<Usuario> usuarios = new ArrayList<>();
        String consulta = "SELECT * FROM usuario;";
        try {
            pst = conn.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
           
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setPerfil(rs.getString("perfil"));
                usuarios.add(usuario);
            }
            pst.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return usuarios;
    }
    
    //Metodo para excluir usuario pelo cpf
    
    public void excluirUsuario(String cpfExcluido){
        String delete = "DELETE FROM usuario where cpf = ?";
        Connection conn = ConnectionFactory.obtemConexao();
        PreparedStatement pst = null;
        
        try {
            pst = conn.prepareStatement(delete);
            Usuario usuario = new Usuario();
            
            pst.setString(1, cpfExcluido);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario Excluido com sucesso");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
